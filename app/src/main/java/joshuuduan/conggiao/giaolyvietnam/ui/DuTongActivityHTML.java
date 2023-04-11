package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import joshuuduan.conggiao.giaolyvietnam.R;

public class DuTongActivityHTML extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_du_tong_html);


        webView=findViewById(R.id.idWebViewDuTong);

        int a = getIntent().getIntExtra("DuTong",0);
        if(a==0){
            webView.loadUrl("file:///android_asset/giaolydutong/huongdan.html");
        }
        if(a==1){
            webView.loadUrl("file:///android_asset/giaolydutong/modau.html");
        }if(a==2){
            webView.loadUrl("file:///android_asset/giaolydutong/bai1.html");
        }if(a==3){
            webView.loadUrl("file:///android_asset/giaolydutong/bai2.html");
        }if(a==4){
            webView.loadUrl("file:///android_asset/giaolydutong/bai3.html");
        }if(a==5){
            webView.loadUrl("file:///android_asset/giaolydutong/bai4.html");
        }if(a==6){
            webView.loadUrl("file:///android_asset/giaolydutong/bai5.html");
        }if(a==7){
            webView.loadUrl("file:///android_asset/giaolydutong/bai6.html");
        }if(a==8){
            webView.loadUrl("file:///android_asset/giaolydutong/bai7.html");
        }if(a==9){
            webView.loadUrl("file:///android_asset/giaolydutong/bai8.html");
        }if(a==10){
            webView.loadUrl("file:///android_asset/giaolydutong/bai9.html");
        }if(a==11){
            webView.loadUrl("file:///android_asset/giaolydutong/bai10.html");
        }if(a==12){
            webView.loadUrl("file:///android_asset/giaolydutong/bai11.html");
        }if(a==13){
            webView.loadUrl("file:///android_asset/giaolydutong/bai12.html");
        }if(a==14){
            webView.loadUrl("file:///android_asset/giaolydutong/bai13.html");
        }if(a==15){
            webView.loadUrl("file:///android_asset/giaolydutong/bai14.html");
        }if(a==16){
            webView.loadUrl("file:///android_asset/giaolydutong/bai15.html");
        }if(a==17){
            webView.loadUrl("file:///android_asset/giaolydutong/bai16.html");
        }if(a==18){
            webView.loadUrl("file:///android_asset/giaolydutong/bai17.html");
        }if(a==19){
            webView.loadUrl("file:///android_asset/giaolydutong/bai18.html");
        }if(a==20){
            webView.loadUrl("file:///android_asset/giaolydutong/bai19.html");
        }if(a==21){
            webView.loadUrl("file:///android_asset/giaolydutong/bai20.html");
        }if(a==22){
            webView.loadUrl("file:///android_asset/giaolydutong/bai21.html");
        }if(a==23){
            webView.loadUrl("file:///android_asset/giaolydutong/bai22.html");
        }if(a==24){
            webView.loadUrl("file:///android_asset/giaolydutong/bai23.html");
        }if(a==25){
            webView.loadUrl("file:///android_asset/giaolydutong/bai24.html");
        }


    }
}