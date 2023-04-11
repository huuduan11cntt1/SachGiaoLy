package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import joshuuduan.conggiao.giaolyvietnam.R;
import android.os.Bundle;
import android.webkit.WebView;


public class KinhThanhIII_HTML extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinh_thanh_iii_html);

        webView=findViewById(R.id.idWebViewKinhThanhIII);

        int i = getIntent().getIntExtra("Kinh_Thanh_III",0);
        if(i==0){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai1.html");
        }if(i==1){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai2.html");
        }if(i==2){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai3.html");
        }if(i==3){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai4.html");
        }if(i==4){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai5.html");
        }if(i==5){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai6.html");
        }if(i==6){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai7.html");
        }if(i==7){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai8.html");
        }if(i==8){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai9.html");
        }if(i==9){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai10.html");
        }if(i==10){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai11.html");
        }if(i==11){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai12.html");
        }if(i==12){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai13.html");
        }if(i==13){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai14.html");
        }if(i==14){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai15.html");
        }if(i==15){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai16.html");
        }if(i==16){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai17.html");
        }if(i==17){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai18.html");
        }if(i==18){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai19.html");
        }if(i==19){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai20.html");
        }if(i==20){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai21.html");
        }if(i==21){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai22.html");
        }if(i==22){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai23.html");
        }if(i==23){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai24.html");
        }if(i==24){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai25.html");
        }if(i==25){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai26.html");
        }if(i==26){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai27.html");
        }if(i==27){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai28.html");
        }if(i==28){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai29.html");
        }if(i==29){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai30.html");
        }if(i==30){
            webView.loadUrl("file:///android_asset/kinhthanh3/bai31.html");
        }


    }
}