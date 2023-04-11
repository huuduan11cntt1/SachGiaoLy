package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import joshuuduan.conggiao.giaolyvietnam.R;

public class CanBanII_HTML extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can_ban_ii_html);
        webView=findViewById(R.id.idWebViewCB2);



        int a = getIntent().getIntExtra("CanBanII",0);
        if(a==0){
            webView.loadUrl("file:///android_asset/canban2/loimodau.html");
        }
        if(a==1){
            webView.loadUrl("file:///android_asset/canban2/bai1.html");
        }if(a==2){
            webView.loadUrl("file:///android_asset/canban2/bai2.html");
        }if(a==3){
            webView.loadUrl("file:///android_asset/canban2/bai3.html");
        }if(a==4){
            webView.loadUrl("file:///android_asset/canban2/bai4.html");
        }if(a==5){
            webView.loadUrl("file:///android_asset/canban2/bai5.html");
        }if(a==6){
            webView.loadUrl("file:///android_asset/canban2/bai6.html");
        }if(a==7){
            webView.loadUrl("file:///android_asset/canban2/bai7.html");
        }if(a==8){
            webView.loadUrl("file:///android_asset/canban2/bai8.html");
        }if(a==9){
            webView.loadUrl("file:///android_asset/canban2/bai9.html");
        }if(a==10){
            webView.loadUrl("file:///android_asset/canban2/bai10.html");
        }if(a==11){
            webView.loadUrl("file:///android_asset/canban2/bai11.html");
        }if(a==12){
            webView.loadUrl("file:///android_asset/canban2/bai12.html");
        }if(a==13){
            webView.loadUrl("file:///android_asset/canban2/bai13.html");
        }if(a==14){
            webView.loadUrl("file:///android_asset/canban2/bai14.html");
        }if(a==15){
            webView.loadUrl("file:///android_asset/canban2/bai15.html");
        }if(a==16){
            webView.loadUrl("file:///android_asset/canban2/bai16.html");
        }if(a==17){
            webView.loadUrl("file:///android_asset/canban2/bai17.html");
        }if(a==18){
            webView.loadUrl("file:///android_asset/canban2/bai18.html");
        }if(a==19){
            webView.loadUrl("file:///android_asset/canban2/bai29.html");
        }if(a==20){
            webView.loadUrl("file:///android_asset/canban2/bai20.html");
        }if(a==21){
            webView.loadUrl("file:///android_asset/canban2/bai21.html");
        }if(a==22){
            webView.loadUrl("file:///android_asset/canban2/bai22.html");
        }if(a==23){
            webView.loadUrl("file:///android_asset/canban2/bai23.html");
        }if(a==24){
            webView.loadUrl("file:///android_asset/canban2/bai24.html");
        }if(a==25){
            webView.loadUrl("file:///android_asset/canban2/bai25.html");
        }if(a==26){
            webView.loadUrl("file:///android_asset/canban2/bai26.html");
        }if(a==27){
            webView.loadUrl("file:///android_asset/canban2/bai27.html");
        }if(a==28){
            webView.loadUrl("file:///android_asset/canban2/bai28.html");
        }if(a==29){
            webView.loadUrl("file:///android_asset/canban2/bai29.html");
        }if(a==30){
            webView.loadUrl("file:///android_asset/canban2/bai30.html");
        }if(a==31){
            webView.loadUrl("file:///android_asset/canban2/bai31.html");
        }if(a==32){
            webView.loadUrl("file:///android_asset/canban2/bai32.html");
        }
    }
}