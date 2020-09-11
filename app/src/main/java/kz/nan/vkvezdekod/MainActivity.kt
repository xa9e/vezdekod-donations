package kz.nan.vkvezdekod

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        window.navigationBarColor = ContextCompat.getColor(this, R.color.colorNavBar)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorStatusBar)
        //context.getWindow().setNavigationBarColor(ContextCompat.getColor(context, R.color.navBar));
        // context.getWindow().setStatusBarColor(ContextCompat.getColor(context,R.color.statusBar));
    }
}