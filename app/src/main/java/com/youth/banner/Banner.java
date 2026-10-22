package com.youth.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.AbstractC0871a;
import androidx.viewpager.widget.ViewPager;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoaderInterface;
import com.youth.banner.view.BannerViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Banner extends FrameLayout implements ViewPager.InterfaceC0866j {
    private BannerPagerAdapter adapter;
    private int bannerBackgroundImage;
    private ImageView bannerDefaultImage;
    private OnBannerClickListener bannerListener;
    private int bannerStyle;
    private TextView bannerTitle;
    private Context context;
    private int count;
    private int currentItem;
    private int delayTime;

    /* renamed from: dm */
    private DisplayMetrics f17557dm;
    private int gravity;
    private WeakHandler handler;
    private ImageLoaderInterface imageLoader;
    private List imageUrls;
    private List<View> imageViews;
    private LinearLayout indicator;
    private List<ImageView> indicatorImages;
    private LinearLayout indicatorInside;
    private int indicatorSize;
    private boolean isAutoPlay;
    private boolean isScroll;
    private int lastPosition;
    private OnBannerListener listener;
    private int mIndicatorHeight;
    private int mIndicatorMargin;
    private int mIndicatorSelectedHeight;
    private int mIndicatorSelectedResId;
    private int mIndicatorSelectedWidth;
    private int mIndicatorUnselectedResId;
    private int mIndicatorWidth;
    private int mLayoutResId;
    private ViewPager.InterfaceC0866j mOnPageChangeListener;
    private BannerScroller mScroller;
    private TextView numIndicator;
    private TextView numIndicatorInside;
    private int scaleType;
    private int scrollTime;
    private int startIndex;
    public String tag;
    private final Runnable task;
    private int titleBackground;
    private int titleHeight;
    private int titleTextColor;
    private int titleTextSize;
    private LinearLayout titleView;
    private List<String> titles;
    public BannerViewPager viewPager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class BannerPagerAdapter extends AbstractC0871a {
        BannerPagerAdapter() {
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public int getCount() {
            return Banner.this.imageViews.size();
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public Object instantiateItem(ViewGroup viewGroup, final int i10) {
            viewGroup.addView((View) Banner.this.imageViews.get(i10));
            View view = (View) Banner.this.imageViews.get(i10);
            if (Banner.this.bannerListener != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.youth.banner.Banner.BannerPagerAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Log.e(Banner.this.tag, "你正在使用旧版点击事件接口，下标是从1开始，为了体验请更换为setOnBannerListener，下标从0开始计算");
                        Banner.this.bannerListener.OnBannerClick(i10);
                    }
                });
            }
            if (Banner.this.listener != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.youth.banner.Banner.BannerPagerAdapter.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Banner.this.listener.OnBannerClick(Banner.this.toRealPosition(i10));
                    }
                });
            }
            return view;
        }

        @Override // androidx.viewpager.widget.AbstractC0871a
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public Banner(Context context) {
        this(context, null);
    }

    private void createIndicator() {
        LinearLayout.LayoutParams layoutParams;
        this.indicatorImages.clear();
        this.indicator.removeAllViews();
        this.indicatorInside.removeAllViews();
        for (int i10 = 0; i10 < this.count; i10++) {
            ImageView imageView = new ImageView(this.context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (i10 == 0) {
                layoutParams = new LinearLayout.LayoutParams(this.mIndicatorSelectedWidth, this.mIndicatorSelectedHeight);
                imageView.setImageResource(this.mIndicatorSelectedResId);
            } else {
                layoutParams = new LinearLayout.LayoutParams(this.mIndicatorWidth, this.mIndicatorHeight);
                imageView.setImageResource(this.mIndicatorUnselectedResId);
            }
            int i11 = this.mIndicatorMargin;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
            this.indicatorImages.add(imageView);
            int i12 = this.bannerStyle;
            if (i12 != 1 && i12 != 4) {
                if (i12 == 5) {
                    this.indicatorInside.addView(imageView, layoutParams);
                }
            } else {
                this.indicator.addView(imageView, layoutParams);
            }
        }
    }

    private void handleTypedArray(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3909R.styleable.Banner);
        this.mIndicatorWidth = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_indicator_width, this.indicatorSize);
        this.mIndicatorHeight = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_indicator_height, this.indicatorSize);
        this.mIndicatorSelectedWidth = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_indicator_selected_width, this.indicatorSize);
        this.mIndicatorSelectedHeight = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_indicator_selected_height, this.indicatorSize);
        this.mIndicatorMargin = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_indicator_margin, 5);
        this.mIndicatorSelectedResId = obtainStyledAttributes.getResourceId(C3909R.styleable.Banner_indicator_drawable_selected, C3909R.drawable.gray_radius);
        this.mIndicatorUnselectedResId = obtainStyledAttributes.getResourceId(C3909R.styleable.Banner_indicator_drawable_unselected, C3909R.drawable.white_radius);
        this.scaleType = obtainStyledAttributes.getInt(C3909R.styleable.Banner_image_scale_type, this.scaleType);
        this.delayTime = obtainStyledAttributes.getInt(C3909R.styleable.Banner_delay_time, BannerConfig.TIME);
        this.scrollTime = obtainStyledAttributes.getInt(C3909R.styleable.Banner_scroll_time, 800);
        this.isAutoPlay = obtainStyledAttributes.getBoolean(C3909R.styleable.Banner_is_auto_play, true);
        this.titleBackground = obtainStyledAttributes.getColor(C3909R.styleable.Banner_title_background, -1);
        this.titleHeight = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_title_height, -1);
        this.titleTextColor = obtainStyledAttributes.getColor(C3909R.styleable.Banner_title_textcolor, -1);
        this.titleTextSize = obtainStyledAttributes.getDimensionPixelSize(C3909R.styleable.Banner_title_textsize, -1);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(C3909R.styleable.Banner_banner_layout, this.mLayoutResId);
        this.bannerBackgroundImage = obtainStyledAttributes.getResourceId(C3909R.styleable.Banner_banner_default_image, C3909R.drawable.no_banner);
        obtainStyledAttributes.recycle();
    }

    private void initImages() {
        this.imageViews.clear();
        int i10 = this.bannerStyle;
        if (i10 != 1 && i10 != 4 && i10 != 5) {
            if (i10 == 3) {
                this.numIndicatorInside.setText("1/" + this.count);
                return;
            }
            if (i10 == 2) {
                this.numIndicator.setText("1/" + this.count);
                return;
            }
            return;
        }
        createIndicator();
    }

    private void initView(Context context, AttributeSet attributeSet) {
        this.imageViews.clear();
        handleTypedArray(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(this.mLayoutResId, (ViewGroup) this, true);
        this.bannerDefaultImage = (ImageView) inflate.findViewById(C3909R.id.bannerDefaultImage);
        this.viewPager = (BannerViewPager) inflate.findViewById(C3909R.id.bannerViewPager);
        this.titleView = (LinearLayout) inflate.findViewById(C3909R.id.titleView);
        this.indicator = (LinearLayout) inflate.findViewById(C3909R.id.circleIndicator);
        this.indicatorInside = (LinearLayout) inflate.findViewById(C3909R.id.indicatorInside);
        this.bannerTitle = (TextView) inflate.findViewById(C3909R.id.bannerTitle);
        this.numIndicator = (TextView) inflate.findViewById(C3909R.id.numIndicator);
        this.numIndicatorInside = (TextView) inflate.findViewById(C3909R.id.numIndicatorInside);
        this.bannerDefaultImage.setImageResource(this.bannerBackgroundImage);
        initViewPagerScroll();
    }

    private void initViewPagerScroll() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            BannerScroller bannerScroller = new BannerScroller(this.viewPager.getContext());
            this.mScroller = bannerScroller;
            bannerScroller.setDuration(this.scrollTime);
            declaredField.set(this.viewPager, this.mScroller);
        } catch (Exception e10) {
            Log.e(this.tag, e10.getMessage());
        }
    }

    private void setBannerStyleUI() {
        int i10;
        if (this.count > 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i11 = this.bannerStyle;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            this.indicatorInside.setVisibility(i10);
                            setTitleStyleUI();
                            return;
                        }
                        return;
                    }
                    this.indicator.setVisibility(i10);
                    setTitleStyleUI();
                    return;
                }
                this.numIndicatorInside.setVisibility(i10);
                setTitleStyleUI();
                return;
            }
            this.numIndicator.setVisibility(i10);
            return;
        }
        this.indicator.setVisibility(i10);
    }

    private void setData() {
        int i10 = this.startIndex;
        if (i10 != 0) {
            this.currentItem = i10;
        } else {
            this.currentItem = 1;
        }
        BannerPagerAdapter bannerPagerAdapter = this.adapter;
        if (bannerPagerAdapter == null) {
            this.adapter = new BannerPagerAdapter();
            this.viewPager.addOnPageChangeListener(this);
            this.viewPager.setAdapter(this.adapter);
        } else {
            bannerPagerAdapter.notifyDataSetChanged();
        }
        this.viewPager.setFocusable(true);
        this.viewPager.setCurrentItem(this.currentItem);
        int i11 = this.gravity;
        if (i11 != -1) {
            this.indicator.setGravity(i11);
        }
        if (this.isScroll && this.count > 1) {
            this.viewPager.setScrollable(true);
        } else {
            this.viewPager.setScrollable(false);
        }
        if (this.isAutoPlay) {
            startAutoPlay();
        }
    }

    private void setImageList(List<?> list) {
        Object obj;
        View view;
        if (list != null && list.size() > 0) {
            this.bannerDefaultImage.setVisibility(8);
            initImages();
            int i10 = 0;
            while (true) {
                int i11 = this.count;
                if (i10 <= i11 + 1) {
                    if (i10 == 0) {
                        obj = list.get(i11 - 1);
                    } else if (i10 == i11 + 1) {
                        obj = list.get(0);
                    } else {
                        obj = list.get(i10 - 1);
                    }
                    ImageLoaderInterface imageLoaderInterface = this.imageLoader;
                    if (imageLoaderInterface != null) {
                        view = imageLoaderInterface.createImageView(this.context, obj);
                    } else {
                        view = null;
                    }
                    if (view == null) {
                        view = new ImageView(this.context);
                    }
                    setScaleType(view);
                    this.imageViews.add(view);
                    ImageLoaderInterface imageLoaderInterface2 = this.imageLoader;
                    if (imageLoaderInterface2 != null) {
                        imageLoaderInterface2.displayImage(this.context.getApplicationContext(), obj, view);
                    } else {
                        Log.e(this.tag, "Please set images loader.");
                    }
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            this.bannerDefaultImage.setVisibility(0);
            Log.e(this.tag, "The image data set is empty.");
        }
    }

    private void setScaleType(View view) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            switch (this.scaleType) {
                case 0:
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                case 1:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    return;
                case 2:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return;
                case 3:
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                case 4:
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    return;
                case 5:
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    return;
                case 6:
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return;
                case 7:
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    return;
                default:
                    return;
            }
        }
    }

    private void setTitleStyleUI() {
        if (this.titles.size() == this.imageUrls.size()) {
            int i10 = this.titleBackground;
            if (i10 != -1) {
                this.titleView.setBackgroundColor(i10);
            }
            if (this.titleHeight != -1) {
                this.titleView.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.titleHeight));
            }
            int i11 = this.titleTextColor;
            if (i11 != -1) {
                this.bannerTitle.setTextColor(i11);
            }
            int i12 = this.titleTextSize;
            if (i12 != -1) {
                this.bannerTitle.setTextSize(0, i12);
            }
            List<String> list = this.titles;
            if (list != null && list.size() > 0) {
                this.bannerTitle.setText(this.titles.get(0));
                this.bannerTitle.setVisibility(0);
                this.titleView.setVisibility(0);
                return;
            }
            return;
        }
        throw new RuntimeException("[Banner] --> The number of titles and images is different");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isAutoPlay) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3 && action != 4) {
                if (action == 0) {
                    stopAutoPlay();
                }
            } else {
                startAutoPlay();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Banner isAutoPlay(boolean z10) {
        this.isAutoPlay = z10;
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
    public void onPageScrollStateChanged(int i10) {
        ViewPager.InterfaceC0866j interfaceC0866j = this.mOnPageChangeListener;
        if (interfaceC0866j != null) {
            interfaceC0866j.onPageScrollStateChanged(i10);
        }
        if (i10 != 0) {
            if (i10 == 1) {
                int i11 = this.currentItem;
                int i12 = this.count;
                if (i11 == i12 + 1) {
                    this.viewPager.setCurrentItem(1, false);
                    return;
                } else {
                    if (i11 == 0) {
                        this.viewPager.setCurrentItem(i12, false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i13 = this.currentItem;
        if (i13 == 0) {
            this.viewPager.setCurrentItem(this.count, false);
        } else if (i13 == this.count + 1) {
            this.viewPager.setCurrentItem(1, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
    public void onPageScrolled(int i10, float f10, int i11) {
        ViewPager.InterfaceC0866j interfaceC0866j = this.mOnPageChangeListener;
        if (interfaceC0866j != null) {
            interfaceC0866j.onPageScrolled(toRealPosition(i10), f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
    public void onPageSelected(int i10) {
        this.currentItem = i10;
        ViewPager.InterfaceC0866j interfaceC0866j = this.mOnPageChangeListener;
        if (interfaceC0866j != null) {
            interfaceC0866j.onPageSelected(toRealPosition(i10));
        }
        int i11 = this.bannerStyle;
        if (i11 == 1 || i11 == 4 || i11 == 5) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.mIndicatorSelectedWidth, this.mIndicatorSelectedHeight);
            int i12 = this.mIndicatorMargin;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.mIndicatorWidth, this.mIndicatorHeight);
            int i13 = this.mIndicatorMargin;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i13;
            List<ImageView> list = this.indicatorImages;
            int i14 = this.lastPosition - 1;
            int i15 = this.count;
            list.get((i14 + i15) % i15).setImageResource(this.mIndicatorUnselectedResId);
            List<ImageView> list2 = this.indicatorImages;
            int i16 = this.lastPosition - 1;
            int i17 = this.count;
            list2.get((i16 + i17) % i17).setLayoutParams(layoutParams2);
            List<ImageView> list3 = this.indicatorImages;
            int i18 = i10 - 1;
            int i19 = this.count;
            list3.get((i18 + i19) % i19).setImageResource(this.mIndicatorSelectedResId);
            List<ImageView> list4 = this.indicatorImages;
            int i20 = this.count;
            list4.get((i18 + i20) % i20).setLayoutParams(layoutParams);
            this.lastPosition = i10;
        }
        if (i10 == 0) {
            i10 = this.count;
        }
        if (i10 > this.count) {
            i10 = 1;
        }
        int i21 = this.bannerStyle;
        if (i21 != 2) {
            if (i21 != 3) {
                if (i21 != 4) {
                    if (i21 == 5) {
                        this.bannerTitle.setText(this.titles.get(i10 - 1));
                        return;
                    }
                    return;
                }
                this.bannerTitle.setText(this.titles.get(i10 - 1));
                return;
            }
            this.numIndicatorInside.setText(i10 + Operator.Operation.DIVISION + this.count);
            this.bannerTitle.setText(this.titles.get(i10 - 1));
            return;
        }
        this.numIndicator.setText(i10 + Operator.Operation.DIVISION + this.count);
    }

    public void releaseBanner() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public Banner setBannerAnimation(Class<? extends ViewPager.InterfaceC0867k> cls) {
        try {
            setPageTransformer(true, cls.newInstance());
        } catch (Exception unused) {
            Log.e(this.tag, "Please set the PageTransformer class");
        }
        return this;
    }

    public Banner setBannerStyle(int i10) {
        this.bannerStyle = i10;
        return this;
    }

    public Banner setBannerTitles(List<String> list) {
        this.titles = list;
        return this;
    }

    public Banner setDelayTime(int i10) {
        this.delayTime = i10;
        return this;
    }

    public Banner setImageLoader(ImageLoaderInterface imageLoaderInterface) {
        this.imageLoader = imageLoaderInterface;
        return this;
    }

    public Banner setImages(List<?> list) {
        this.imageUrls.addAll(list);
        this.count = list.size();
        return this;
    }

    public Banner setIndicatorGravity(int i10) {
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 == 7) {
                    this.gravity = 21;
                }
            } else {
                this.gravity = 17;
            }
        } else {
            this.gravity = 19;
        }
        return this;
    }

    public Banner setOffscreenPageLimit(int i10) {
        BannerViewPager bannerViewPager = this.viewPager;
        if (bannerViewPager != null) {
            bannerViewPager.setOffscreenPageLimit(i10);
        }
        return this;
    }

    @Deprecated
    public Banner setOnBannerClickListener(OnBannerClickListener onBannerClickListener) {
        this.bannerListener = onBannerClickListener;
        return this;
    }

    public Banner setOnBannerListener(OnBannerListener onBannerListener) {
        this.listener = onBannerListener;
        return this;
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0866j interfaceC0866j) {
        this.mOnPageChangeListener = interfaceC0866j;
    }

    public Banner setPageTransformer(boolean z10, ViewPager.InterfaceC0867k interfaceC0867k) {
        this.viewPager.setPageTransformer(z10, interfaceC0867k);
        return this;
    }

    public Banner setStartIndex(int i10) {
        this.startIndex = i10;
        return this;
    }

    public Banner setViewPagerIsScroll(boolean z10) {
        this.isScroll = z10;
        return this;
    }

    public Banner start() {
        setBannerStyleUI();
        setImageList(this.imageUrls);
        setData();
        return this;
    }

    public void startAutoPlay() {
        this.handler.removeCallbacks(this.task);
        this.handler.postDelayed(this.task, this.delayTime);
    }

    public void stopAutoPlay() {
        this.handler.removeCallbacks(this.task);
    }

    public int toRealPosition(int i10) {
        int i11;
        int i12 = this.count;
        if (i12 != 0) {
            i11 = (i10 - 1) % i12;
        } else {
            i11 = 0;
        }
        if (i11 < 0) {
            return i11 + i12;
        }
        return i11;
    }

    public void update(List<?> list, List<String> list2) {
        this.titles.clear();
        this.titles.addAll(list2);
        update(list);
    }

    public void updateBannerStyle(int i10) {
        this.indicator.setVisibility(8);
        this.numIndicator.setVisibility(8);
        this.numIndicatorInside.setVisibility(8);
        this.indicatorInside.setVisibility(8);
        this.bannerTitle.setVisibility(8);
        this.titleView.setVisibility(8);
        this.bannerStyle = i10;
        start();
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Banner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.tag = "banner";
        this.mIndicatorMargin = 5;
        this.bannerStyle = 1;
        this.delayTime = BannerConfig.TIME;
        this.scrollTime = 800;
        this.isAutoPlay = true;
        this.isScroll = true;
        this.mIndicatorSelectedResId = C3909R.drawable.gray_radius;
        this.mIndicatorUnselectedResId = C3909R.drawable.white_radius;
        this.mLayoutResId = C3909R.layout.banner;
        this.count = 0;
        this.gravity = -1;
        this.lastPosition = 1;
        this.scaleType = 1;
        this.handler = new WeakHandler();
        this.task = new Runnable() { // from class: com.youth.banner.Banner.1
            @Override // java.lang.Runnable
            public void run() {
                if (Banner.this.count > 1 && Banner.this.isAutoPlay) {
                    Banner banner = Banner.this;
                    banner.currentItem = (banner.currentItem % (Banner.this.count + 1)) + 1;
                    if (Banner.this.currentItem == 1) {
                        Banner banner2 = Banner.this;
                        banner2.viewPager.setCurrentItem(banner2.currentItem, false);
                        Banner.this.handler.post(Banner.this.task);
                    } else {
                        Banner banner3 = Banner.this;
                        banner3.viewPager.setCurrentItem(banner3.currentItem);
                        Banner.this.handler.postDelayed(Banner.this.task, Banner.this.delayTime);
                    }
                }
            }
        };
        this.context = context;
        this.titles = new ArrayList();
        this.imageUrls = new ArrayList();
        this.imageViews = new ArrayList();
        this.indicatorImages = new ArrayList();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f17557dm = displayMetrics;
        this.indicatorSize = displayMetrics.widthPixels / 80;
        initView(context, attributeSet);
    }

    public void update(List<?> list) {
        this.imageUrls.clear();
        this.imageViews.clear();
        this.indicatorImages.clear();
        this.imageUrls.addAll(list);
        this.count = this.imageUrls.size();
        start();
    }
}
