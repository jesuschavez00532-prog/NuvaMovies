package com.youth.banner;

import androidx.viewpager.widget.ViewPager;
import com.youth.banner.transformer.AccordionTransformer;
import com.youth.banner.transformer.BackgroundToForegroundTransformer;
import com.youth.banner.transformer.CubeInTransformer;
import com.youth.banner.transformer.CubeOutTransformer;
import com.youth.banner.transformer.DefaultTransformer;
import com.youth.banner.transformer.DepthPageTransformer;
import com.youth.banner.transformer.FlipHorizontalTransformer;
import com.youth.banner.transformer.FlipVerticalTransformer;
import com.youth.banner.transformer.ForegroundToBackgroundTransformer;
import com.youth.banner.transformer.RotateDownTransformer;
import com.youth.banner.transformer.RotateUpTransformer;
import com.youth.banner.transformer.ScaleInOutTransformer;
import com.youth.banner.transformer.StackTransformer;
import com.youth.banner.transformer.TabletTransformer;
import com.youth.banner.transformer.ZoomInTransformer;
import com.youth.banner.transformer.ZoomOutSlideTransformer;
import com.youth.banner.transformer.ZoomOutTranformer;

/* loaded from: classes3.dex */
public class Transformer {
    public static Class<? extends ViewPager.InterfaceC0867k> Default = DefaultTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> Accordion = AccordionTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> CubeIn = CubeInTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> CubeOut = CubeOutTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> DepthPage = DepthPageTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> RotateDown = RotateDownTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> RotateUp = RotateUpTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> Stack = StackTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> Tablet = TabletTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends ViewPager.InterfaceC0867k> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
