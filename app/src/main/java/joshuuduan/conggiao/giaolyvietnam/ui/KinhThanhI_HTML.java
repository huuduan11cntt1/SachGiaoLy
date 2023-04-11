package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import joshuuduan.conggiao.giaolyvietnam.R;
import android.os.Bundle;
import android.webkit.WebView;


public class KinhThanhI_HTML extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinh_thanh_ihtml);

        int i = getIntent().getIntExtra("Kinh_Thanh_I",0);

        if(i==0){
            webView.loadUrl("file:///android_asset/kinhthanh1/Bai1.html");
        }if(i==1){
            webView.loadUrl("file:///android_asset/kinhthanh1/Bai2.html");
        }if(i==2){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai3.html");
        }if(i==3){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai4.html");
        }if(i==4){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai5.html");
        }if(i==5){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai6.html");
        }if(i==6){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai7.html");
        }if(i==7){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai8.html");
        }if(i==8){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai9.html");
        }if(i==9){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai10.html");
        }if(i==10){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai11.html");
        }if(i==11){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai12.html");
        }if(i==12){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai13.html");
        }if(i==13){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai14.html");
        }if(i==14){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai15.html");
        }if(i==15){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai16.html");
        }if(i==16){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai17.html");
        }if(i==17){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai18.html");
        }if(i==18){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai19.html");
        }if(i==19){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai20.html");
        }if(i==20){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai21.html");
        }if(i==21){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai22.html");
        }if(i==22){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai23.html");
        }if(i==23){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai24.html");
        }if(i==24){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai25.html");
        }if(i==25){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai26.html");
        }if(i==26){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai27.html");
        }if(i==27){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai28.html");
        }if(i==28){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai29.html");
        }if(i==29){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai30.html");
        }if(i==30){
            webView.loadUrl("file:///android_asset/kinhthanh1/bai31.html");
        }

    }
}