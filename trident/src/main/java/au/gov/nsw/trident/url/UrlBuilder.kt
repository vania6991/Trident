package au.gov.nsw.trident.url

import android.content.Context
import androidx.core.net.toUri
import com.appsflyer.AppsFlyerLib
import java.util.*

typealias AppsMap = MutableMap<String, Any>?

class UrlBuilder(
    private val advertisingId: String,
    private val deepLink: String,
    private val appsMap: AppsMap,
    private val context: Context
) {

    fun buildUrl(): String =
        INIT_URL.toUri().buildUpon().apply {
            appendQueryParameter(SECURE_GET_PARAMETR, SECURE_KEY)
            appendQueryParameter(DEV_TMZ_KEY, TimeZone.getDefault().id)
            appendQueryParameter(GADID_KEY, advertisingId)
            appendQueryParameter(DEEPLINK_KEY, deepLink)

            if (deepLink != "null") {
                appendQueryParameter(
                    SOURCE_KEY,
                    "deeplink"
                )
                appendQueryParameter(
                    AF_ID_KEY,
                    "null"
                )
            } else {
                appendQueryParameter(
                    SOURCE_KEY,
                    appsMap?.get("media_source").toString()
                )

                appendQueryParameter(
                    AF_ID_KEY,
                    AppsFlyerLib.getInstance().getAppsFlyerUID(context)
                )
            }

            appendQueryParameter(
                ADSET_ID_KEY,
                appsMap?.get("ad set_id").toString()
            )
            appendQueryParameter(
                CAMPAIGN_ID_KEY,
                appsMap?.get("campaign_id").toString()
            )
            appendQueryParameter(
                APP_CAMPAIGN_KEY,
                appsMap?.get("campaign").toString()
            )
            appendQueryParameter(
                ORIG_COST_KEY,
                appsMap?.get("orig_cost").toString()
            )
            appendQueryParameter(ADSET_KEY, appsMap?.get("adset").toString())
            appendQueryParameter(ADGROUP_KEY, appsMap?.get("adgroup").toString())

            appendQueryParameter(
                AF_SITEID_KEY,
                appsMap?.get("af_siteid").toString()
            )
        }.toString()

    companion object {
        private const val INIT_URL = "https://firelepry.space/bookOfWin.php"

        private const val SECURE_GET_PARAMETR = "8vtsC0qeSz"
        private const val SECURE_KEY = "Pe7Qeeenme"
        private const val DEV_TMZ_KEY = "JHiLfg7FHI"
        private const val GADID_KEY = "8iLLcCFthO"
        private const val DEEPLINK_KEY = "ZeezQwHSUN"
        private const val SOURCE_KEY = "k9O0Ylhr2n"
        private const val AF_ID_KEY = "QFgMU1weqX"
        private const val ADSET_ID_KEY = "KYWJW8kCEe"
        private const val CAMPAIGN_ID_KEY = "bo0IH4Ile1"
        private const val APP_CAMPAIGN_KEY = "iDXrzyR68W"
        private const val ORIG_COST_KEY = "DNZkaGaRYS"
        private const val ADSET_KEY = "EDOI8rVt9R"
        private const val ADGROUP_KEY = "4ng9qjWP8M"
        private const val AF_SITEID_KEY = "7RwdnQ8jN5"
    }
}