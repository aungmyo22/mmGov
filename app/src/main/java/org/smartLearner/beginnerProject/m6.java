package org.smartLearner.beginnerProject;
import android.webkit.*;
import android.app.*;
import android.os.*;
public class m6
extends Activity 
    {
        WebView wv;
        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.v6);
                getActionBar().hide();
                wv=findViewById(R.id.v6);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("http://www.mora.gov.mm/");
            }

        @Override
        public void onBackPressed()
            {
                if(wv.canGoBack()){
                        wv.goBack();
                    }else{
                        super.onBackPressed();
                    }
            }
}
