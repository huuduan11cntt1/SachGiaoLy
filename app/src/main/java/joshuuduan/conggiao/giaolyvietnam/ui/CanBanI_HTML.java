package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import joshuuduan.conggiao.giaolyvietnam.R;
public class CanBanI_HTML extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.can_ban_ihtml);
        webView=findViewById(R.id.idWebViewCB1);


        int a = getIntent().getIntExtra("CanBanI",0);
        if(a==0){
            webView.loadUrl("file:///android_asset/canban1/loingo.html");
        }
        if(a==1){
            webView.loadUrl("file:///android_asset/canban1/bai1.html");
        }if(a==2){
            webView.loadUrl("file:///android_asset/canban1/bai2.html");
        }if(a==3){
            webView.loadUrl("file:///android_asset/canban1/bai3.html");
        }if(a==4){
            webView.loadUrl("file:///android_asset/canban1/bai4.html");
        }if(a==5){
            webView.loadUrl("file:///android_asset/canban1/bai5.html");
        }if(a==6){
            webView.loadUrl("file:///android_asset/canban1/bai6.html");
        }if(a==7){
            webView.loadUrl("file:///android_asset/canban1/bai7.html");
        }if(a==8){
            webView.loadUrl("file:///android_asset/canban1/bai8.html");
        }if(a==9){
            webView.loadUrl("file:///android_asset/canban1/bai9.html");
        }if(a==10){
            webView.loadUrl("file:///android_asset/canban1/bai10.html");
        }if(a==11){
            webView.loadUrl("file:///android_asset/canban1/bai11.html");
        }if(a==12){
            webView.loadUrl("file:///android_asset/canban1/bai12.html");
        }if(a==13){
            webView.loadUrl("file:///android_asset/canban1/bai13.html");
        }if(a==14){
            webView.loadUrl("file:///android_asset/canban1/bai14.html");
        }if(a==15){
            webView.loadUrl("file:///android_asset/canban1/bai15.html");
        }if(a==16){
            webView.loadUrl("file:///android_asset/canban1/bai16.html");
        }if(a==17){
            webView.loadUrl("file:///android_asset/canban1/bai17.html");
        }if(a==18){
            webView.loadUrl("file:///android_asset/canban1/bai18.html");
        }if(a==19){
            webView.loadUrl("file:///android_asset/canban1/bai29.html");
        }if(a==20){
            webView.loadUrl("file:///android_asset/canban1/bai20.html");
        }if(a==21){
            webView.loadUrl("file:///android_asset/canban1/bai21.html");
        }if(a==22){
            webView.loadUrl("file:///android_asset/canban1/bai22.html");
        }if(a==23){
            webView.loadUrl("file:///android_asset/canban1/bai23.html");
        }if(a==24){
            webView.loadUrl("file:///android_asset/canban1/bai24.html");
        }if(a==25){
            webView.loadUrl("file:///android_asset/canban1/bai25.html");
        }if(a==26){
            webView.loadUrl("file:///android_asset/canban1/bai26.html");
        }if(a==27){
            webView.loadUrl("file:///android_asset/canban1/bai27.html");
        }if(a==28){
            webView.loadUrl("file:///android_asset/canban1/bai28.html");
        }if(a==29){
            webView.loadUrl("file:///android_asset/canban1/bai29.html");
        }if(a==30){
            webView.loadUrl("file:///android_asset/canban1/bai30.html");
        }if(a==31){
            webView.loadUrl("file:///android_asset/canban1/bai31.html");
        }if(a==32){
            webView.loadUrl("file:///android_asset/canban1/bai32.html");
        }

    }
}