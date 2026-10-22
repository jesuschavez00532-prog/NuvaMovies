package sb;

import com.request.result.ActiveResult;
import com.request.result.AddFavoriteResult;
import com.request.result.AddSubscribeResult;
import com.request.result.ApkQueryCouponResult;
import com.request.result.ApkReceiveCouponResult;
import com.request.result.BaseResult;
import com.request.result.BaseTimeResult;
import com.request.result.BindEmailGiftDaysResult;
import com.request.result.BindPhoneResult;
import com.request.result.CheckForceBindResult;
import com.request.result.CheckVerifiCodeResult;
import com.request.result.ConfigResult;
import com.request.result.DelFavoriteResult;
import com.request.result.EpgResult;
import com.request.result.ExchangeResult;
import com.request.result.FeedBackContactResult;
import com.request.result.FilterByContentResult;
import com.request.result.FilterGenreResult;
import com.request.result.FootballMatchResult;
import com.request.result.FreeResult;
import com.request.result.GetAllbackProgramResult;
import com.request.result.GetAreaCodeResult;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnRecommendsResult;
import com.request.result.GetDeviceResult;
import com.request.result.GetEmailSuffixResult;
import com.request.result.GetExchangeOrderInfoResult;
import com.request.result.GetFavoritesResult;
import com.request.result.GetHomeResult;
import com.request.result.GetInviteCodeResult;
import com.request.result.GetItemDataResult;
import com.request.result.GetLiveDataResult;
import com.request.result.GetNextColumnResult;
import com.request.result.GetOrderInfoResult;
import com.request.result.GetPackageResult;
import com.request.result.GetQrResult;
import com.request.result.GetQrTokenResult;
import com.request.result.GetRecommendsResult;
import com.request.result.GetShelveResult;
import com.request.result.GetSlbInfoBeanResult;
import com.request.result.GetSubscribeResult;
import com.request.result.GetVerifiCodeResult;
import com.request.result.HeartBeatResult;
import com.request.result.LineupResult;
import com.request.result.LoginResult;
import com.request.result.MatchEventResult;
import com.request.result.MatchScoreBoardResult;
import com.request.result.MatchStatResult;
import com.request.result.PersonResult;
import com.request.result.PersonWorksResult;
import com.request.result.PropertiesInfoResult;
import com.request.result.RecommendColumnContentResult;
import com.request.result.RegisterResult;
import com.request.result.SearchByContentResult;
import com.request.result.SearchByNameResult;
import com.request.result.SearchROrPResult;
import com.request.result.ShelveMatchResult;
import com.request.result.SnTokenResult;
import com.request.result.StartPlayBTVResult;
import com.request.result.StartPlayLiveResult;
import com.request.result.StartPlayVODResult;
import com.request.result.TerminalAuthResult;
import com.request.result.UnBindEmailResult;
import com.request.result.UserFeedBackResult;
import com.request.result.VerifyEmailCodeResult;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import p240mf.InterfaceC5672a;
import p240mf.InterfaceC5677f;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5686o;
import p240mf.InterfaceC5687p;
import p240mf.InterfaceC5690s;
import p240mf.InterfaceC5691t;
import p240mf.InterfaceC5694w;
import retrofit2.Call;

/* renamed from: sb.b */
/* loaded from: classes2.dex */
public interface InterfaceC6781b {
    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v2/getLineUps")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: A */
    Observable<LineupResult> m26674A(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("gameId") String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getEmailSuffix")
    /* renamed from: A0 */
    Observable<GetEmailSuffixResult> m26675A0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v6/getLiveData")
    /* renamed from: B */
    Observable<GetLiveDataResult> m26676B(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/changeBindEmail")
    /* renamed from: B0 */
    Observable<BaseResult> m26677B0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getAreaCode")
    /* renamed from: C */
    Observable<GetAreaCodeResult> m26678C(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v2/getAllMatch")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: C0 */
    Observable<FootballMatchResult> m26679C0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("appId") String str3, @InterfaceC5691t("match") String str4, @InterfaceC5691t("gameId") String str5, @InterfaceC5691t("pageSize") int i10);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/filterGenre")
    /* renamed from: D */
    Observable<FilterGenreResult> m26680D(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v4/startPlayLive")
    /* renamed from: D0 */
    Observable<StartPlayLiveResult> m26681D0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getNextColumns")
    /* renamed from: E */
    Observable<GetNextColumnResult> m26682E(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/setPassword")
    /* renamed from: E0 */
    Observable<BaseResult> m26683E0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/package/getOrderInfo")
    /* renamed from: F */
    Observable<GetOrderInfoResult> m26684F(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getRecommendColumnContents")
    /* renamed from: F0 */
    Observable<RecommendColumnContentResult> m26685F0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5687p("{agreement}://{ip}/api/portalCore/device/updateOrInsert")
    /* renamed from: G */
    Observable<BaseResult> m26686G(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getPropertiesInfo")
    /* renamed from: G0 */
    Observable<PropertiesInfoResult> m26687G0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v10/startPlayVOD")
    /* renamed from: H */
    Call<StartPlayVODResult> m26688H(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/addSubscribe")
    /* renamed from: H0 */
    Observable<AddSubscribeResult> m26689H0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getSubscribe")
    /* renamed from: I */
    Observable<GetSubscribeResult> m26690I(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v8/login")
    /* renamed from: I0 */
    Observable<LoginResult> m26691I0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/getRecommends")
    /* renamed from: J */
    Observable<GetRecommendsResult> m26692J(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/addFavorite")
    /* renamed from: J0 */
    Observable<AddFavoriteResult> m26693J0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/getFree")
    /* renamed from: K */
    Observable<FreeResult> m26694K(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/getProgram")
    /* renamed from: K0 */
    Observable<EpgResult> m26695K0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getAllbackProgram")
    /* renamed from: L */
    Observable<GetAllbackProgramResult> m26696L(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/config/get")
    /* renamed from: L0 */
    Observable<ConfigResult> m26697L0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v2/getShelveMatch")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: M */
    Observable<ShelveMatchResult> m26698M(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("appId") String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v6/startPlayBTV")
    /* renamed from: M0 */
    Observable<StartPlayBTVResult> m26699M0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v8/active")
    /* renamed from: N */
    Observable<ActiveResult> m26700N(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v2/getScoreboard")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: O */
    Observable<MatchScoreBoardResult> m26701O(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("match") String str3, @InterfaceC5691t("teamAName") String str4, @InterfaceC5691t("teamBName") String str5);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/apkReceiveCoupon")
    /* renamed from: P */
    Observable<ApkReceiveCouponResult> m26702P(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v2/getTeamEvent")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: Q */
    Observable<MatchEventResult> m26703Q(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("gameId") String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v5/exchange")
    /* renamed from: R */
    Observable<ExchangeResult> m26704R(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v10/startPlayVOD")
    /* renamed from: S */
    Observable<StartPlayVODResult> m26705S(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/getColumnRecommendResource")
    /* renamed from: T */
    Observable<GetColumnRecommendsResult> m26706T(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/updateBindEmailOrPwd")
    /* renamed from: U */
    Observable<BaseResult> m26707U(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v3/getFootballMatch")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: V */
    Observable<FootballMatchResult> m26708V(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("appId") String str3, @InterfaceC5691t("match") String str4, @InterfaceC5691t("date") String str5, @InterfaceC5691t("gameId") String str6, @InterfaceC5691t("appLanguage") String str7);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getVerifiCode")
    /* renamed from: W */
    Observable<GetVerifiCodeResult> m26709W(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v14/getSlbInfo")
    /* renamed from: X */
    Observable<GetSlbInfoBeanResult> m26710X(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/feedback/getCustomerService")
    /* renamed from: Y */
    Observable<FeedBackContactResult> m26711Y(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/snToken")
    /* renamed from: Z */
    Observable<SnTokenResult> m26712Z(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getExchangeOrderInfo")
    /* renamed from: a */
    Observable<GetExchangeOrderInfoResult> m26713a(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/checkVerifiCode")
    /* renamed from: a0 */
    Observable<CheckVerifiCodeResult> m26714a0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/bindEmail")
    /* renamed from: b */
    Observable<BaseResult> m26715b(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/bindEmailGiftDays")
    /* renamed from: b0 */
    Observable<BindEmailGiftDaysResult> m26716b0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/device-management/deleteDevice")
    /* renamed from: c */
    Observable<BaseResult> m26717c(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/blSearchByName")
    /* renamed from: c0 */
    Observable<SearchByNameResult> m26718c0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/apkQueryCoupon")
    /* renamed from: d */
    Observable<ApkQueryCouponResult> m26719d(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v9/getAuthInfo")
    /* renamed from: d0 */
    Observable<GetAuthInfoResult> m26720d0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8", "ProcessResult:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getHome")
    /* renamed from: e */
    Observable<GetHomeResult> m26721e(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getItemByPerson")
    /* renamed from: e0 */
    Observable<PersonWorksResult> m26722e0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v5/loginOut")
    /* renamed from: f */
    Observable<LoginResult> m26723f(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/updateRestrictedStatus")
    /* renamed from: f0 */
    Observable<BaseResult> m26724f0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getPerson")
    /* renamed from: g */
    Observable<PersonResult> m26725g(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/terminalAuth")
    /* renamed from: g0 */
    Observable<TerminalAuthResult> m26726g0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/package/getPackageCustomization")
    /* renamed from: h */
    Observable<GetPackageResult> m26727h(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/qr/token")
    /* renamed from: h0 */
    Observable<GetQrTokenResult> m26728h0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/delSubscribe")
    /* renamed from: i */
    Observable<BaseResult> m26729i(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v4/getNearestMatch")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: i0 */
    Observable<FootballMatchResult> m26730i0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("appId") String str3, @InterfaceC5691t("pageSize") int i10, @InterfaceC5691t("appLanguage") String str4);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/searchByContent")
    /* renamed from: j */
    Observable<SearchByContentResult> m26731j(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/emailResetPassNotice")
    /* renamed from: j0 */
    Observable<BaseResult> m26732j0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/unBind")
    /* renamed from: k */
    Observable<BaseResult> m26733k(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/checkForceBind")
    /* renamed from: k0 */
    Observable<CheckForceBindResult> m26734k0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/filterByContent")
    /* renamed from: l */
    Observable<FilterByContentResult> m26735l(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/sendEmailVerifyCode")
    /* renamed from: l0 */
    Observable<BaseResult> m26736l0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v4/getItemData")
    /* renamed from: m */
    Observable<GetItemDataResult> m26737m(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v5/heartbeat")
    /* renamed from: m0 */
    Observable<HeartBeatResult> m26738m0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/changeBindPhone")
    /* renamed from: n */
    Observable<BaseResult> m26739n(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/searchResourceOrPerson")
    /* renamed from: n0 */
    Observable<SearchROrPResult> m26740n0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v15/getSlbInfo")
    /* renamed from: o */
    Observable<GetSlbInfoBeanResult> m26741o(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/feedback/userFeedBack")
    /* renamed from: o0 */
    Observable<UserFeedBackResult> m26742o0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{protocol}://{ip}/epg/v2/live/app/utc{timezone}/{liveType}")
    @InterfaceC5682k({"NoLog:true"})
    @InterfaceC5694w
    /* renamed from: p */
    Call<ResponseBody> m26743p(@InterfaceC5690s("protocol") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5690s("timezone") String str3, @InterfaceC5690s("liveType") int i10, @InterfaceC5691t("md5") String str4);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/liveSearchByName")
    /* renamed from: p0 */
    Observable<GetLiveDataResult> m26744p0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v2/getMatchDetail")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: q */
    Observable<MatchStatResult> m26745q(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("gameId") String str3, @InterfaceC5691t("teamAName") String str4, @InterfaceC5691t("teamBName") String str5);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v4/resetPwd")
    /* renamed from: q0 */
    Observable<BaseResult> m26746q0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/qr/allowLogin")
    /* renamed from: r */
    Observable<BaseResult> m26747r(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/validateVerifyCode")
    /* renamed from: r0 */
    Observable<VerifyEmailCodeResult> m26748r0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/PreInstall/auth")
    /* renamed from: s */
    Observable<BaseResult> m26749s(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5677f("{agreement}://{ip}/api/portalCore/epg/v5/getNearestMatch")
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    /* renamed from: s0 */
    Observable<FootballMatchResult> m26750s0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5691t("appId") String str3, @InterfaceC5691t("pageSize") int i10);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v5/qr/getResult")
    /* renamed from: t */
    Observable<GetQrResult> m26751t(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getBaseTime")
    /* renamed from: t0 */
    Observable<BaseTimeResult> m26752t0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/device-management/getDevice")
    /* renamed from: u */
    Observable<GetDeviceResult> m26753u(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/delFavorite")
    /* renamed from: u0 */
    Observable<DelFavoriteResult> m26754u0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/getShelveData")
    /* renamed from: v */
    Observable<GetShelveResult> m26755v(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/searchByName")
    /* renamed from: v0 */
    Observable<SearchByNameResult> m26756v0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/register")
    /* renamed from: w */
    Observable<RegisterResult> m26757w(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/getFavorite")
    /* renamed from: w0 */
    Observable<GetFavoritesResult> m26758w0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/pwdCheck")
    /* renamed from: x */
    Observable<BaseResult> m26759x(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8", "needEncrypt:false"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v2/getInviteCode")
    /* renamed from: x0 */
    Observable<GetInviteCodeResult> m26760x0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/bindPhone")
    /* renamed from: y */
    Observable<BindPhoneResult> m26761y(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/blSearchByContent")
    /* renamed from: y0 */
    Observable<SearchByContentResult> m26762y0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Content-Type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/v3/getColumnContents")
    /* renamed from: z */
    Observable<GetColumnContentsResult> m26763z(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);

    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    @InterfaceC5686o("{agreement}://{ip}/api/portalCore/unBindEmail")
    /* renamed from: z0 */
    Observable<UnBindEmailResult> m26764z0(@InterfaceC5690s("agreement") String str, @InterfaceC5690s("ip") String str2, @InterfaceC5672a String str3);
}
