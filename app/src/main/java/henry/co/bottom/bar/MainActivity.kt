package henry.co.bottom.bar

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import henry.co.bottom.navigtion.SpaceItem
import henry.co.bottom.navigtion.SpaceOnClickListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val locale = Locale("en")
//        Locale.setDefault(locale)
//        val config: Configuration = baseContext.resources.configuration
//        config.locale = locale
//        baseContext.resources.updateConfiguration(
//            config,
//            baseContext.resources.displayMetrics
//        )
        initBottomNavigation(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        spaceNavigationView.onSaveInstanceState(outState)
    }

    private fun initBottomNavigation(savedInstanceState: Bundle?) {
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState)

        spaceNavigationView.addMiddleItem(
            icon = R.drawable.near_me,
            text =  getStringRes(R.string.today)
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                itemName = getStringRes(R.string.today),
                itemUnActiveIcon = R.drawable.ic_k_none_active,
                itemActiveIcon =  R.drawable.ic_k_active,
                isSelected = false
            )
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                itemName = getStringRes(R.string.favour),
                itemUnActiveIcon = R.drawable.ic_h_none_active,
                itemActiveIcon =  R.drawable.ic_h_active,
                isSelected = false
            )
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                itemName = getStringRes(R.string.cards),
                itemUnActiveIcon = R.drawable.ic_o_none_active,
                itemActiveIcon =  R.drawable.ic_o_active,
                isSelected = false
            )
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                itemName = getStringRes(R.string.account),
                itemUnActiveIcon = R.drawable.ic_ac_none_active,
                itemActiveIcon =  R.drawable.ic_ac_active,
                isSelected = true
            )
        )

        spaceNavigationView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
                toast("123456")
            }

            override fun onItemClick(itemIndex: Int, itemName: String) {
                toast("${itemIndex}  ${itemName}")
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {

            }
        })
    }
}

fun Context.getStringRes(@StringRes id: Int) = resources.getString(id)

fun Context?.toast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) =
    this?.let { Toast.makeText(it, text, duration).show() }
