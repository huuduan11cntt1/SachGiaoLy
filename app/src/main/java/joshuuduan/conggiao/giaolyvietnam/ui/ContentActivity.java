package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;


import joshuuduan.conggiao.giaolyvietnam.R;

public class ContentActivity extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);




        webView = findViewById(R.id.idWebView);







        int sc= getIntent().getIntExtra("So_Cap_II",0);
        if(sc==0){
            webView.loadUrl("file:///android_asset/socap2/bai1.html");
        }if(sc==1){
            webView.loadUrl("file:///android_asset/socap2/bai2.html");
        }if(sc==2){
            webView.loadUrl("file:///android_asset/socap2/bai3.html");
        }if(sc==3){
            webView.loadUrl("file:///android_asset/socap2/bai4.html");
        }if(sc==4){
            webView.loadUrl("file:///android_asset/socap2/bai5.html");
        }if(sc==5){
            webView.loadUrl("file:///android_asset/socap2/bai6.html");
        }if(sc==6){
            webView.loadUrl("file:///android_asset/socap2/bai7.html");
        }if(sc==7){
            webView.loadUrl("file:///android_asset/socap2/bai8.html");
        }if(sc==8){
            webView.loadUrl("file:///android_asset/socap2/bai9.html");
        }if(sc==9){
            webView.loadUrl("file:///android_asset/socap2/bai10.html");
        }if(sc==10){
            webView.loadUrl("file:///android_asset/socap2/bai11.html");
        }if(sc==11){
            webView.loadUrl("file:///android_asset/socap2/bai12.html");
        }if(sc==12){
            webView.loadUrl("file:///android_asset/socap2/bai13.html");
        }if(sc==13){
            webView.loadUrl("file:///android_asset/socap2/bai14.html");
        }if(sc==14){
            webView.loadUrl("file:///android_asset/socap2/bai15.html");
        }if(sc==15){
            webView.loadUrl("file:///android_asset/socap2/bai16.html");
        }if(sc==16){
            webView.loadUrl("file:///android_asset/socap2/bai17.html");
        }if(sc==17){
            webView.loadUrl("file:///android_asset/socap2/bai18.html");
        }if(sc==18){
            webView.loadUrl("file:///android_asset/socap2/bai19.html");
        }if(sc==19){
            webView.loadUrl("file:///android_asset/socap2/bai20.html");
        }if(sc==20){
            webView.loadUrl("file:///android_asset/socap2/bai21.html");
        }if(sc==21){
            webView.loadUrl("file:///android_asset/socap2/bai22.html");
        }if(sc==22){
            webView.loadUrl("file:///android_asset/socap2/bai23.html");
        }if(sc==23){
            webView.loadUrl("file:///android_asset/socap2/bai24.html");
        }if(sc==24){
            webView.loadUrl("file:///android_asset/socap2/bai25.html");
        }if(sc==25){
            webView.loadUrl("file:///android_asset/socap2/bai26.html");
        }if(sc==26){
            webView.loadUrl("file:///android_asset/socap2/bai27.html");
        }if(sc==27){
            webView.loadUrl("file:///android_asset/socap2/bai28.html");
        }if(sc==28){
            webView.loadUrl("file:///android_asset/socap2/bai29.html");
        }if(sc==29){
            webView.loadUrl("file:///android_asset/socap2/bai30.html");
        }if(sc==30){
            webView.loadUrl("file:///android_asset/socap2/bai31.html");
        }if(sc==31){
            webView.loadUrl("file:///android_asset/socap2/bai32.html");
        }if(sc==32){
            webView.loadUrl("file:///android_asset/socap2/bai33.html");
        }if(sc==33){
            webView.loadUrl("file:///android_asset/socap2/loingo.html");
        }


    }
}