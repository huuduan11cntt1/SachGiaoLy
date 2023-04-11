package joshuuduan.conggiao.giaolyvietnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import joshuuduan.conggiao.giaolyvietnam.R;
import android.os.Bundle;
import android.webkit.WebView;

public class HonNhanCongGiaoHtml extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hon_nhan_cong_giao_html);
        webView =findViewById(R.id.idWebViewHNCG);


        int h =getIntent().getIntExtra("hon_nhan_gia_dinh",0);
        if(h==0){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai1.html");
        }if(h==1){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai2.html");
        }if(h==2){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai3.html");
        }if(h==3){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai4.html");
        }if(h==4){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai5.html");
        }if(h==5){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai6.html");
        }if(h==6){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai7.html");
        }if(h==7){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai8.html");
        }if(h==8){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai9.html");
        }if(h==9){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai10.html");
        }if(h==10){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai11.html");
        }if(h==11){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai12.html");
        }if(h==12){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai13.html");
        }if(h==13){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai14.html");
        }if(h==14){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai15.html");
        }if(h==15){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai16.html");
        }if(h==16){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai17.html");
        }if(h==17){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai18.html");
        }if(h==18){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai19.html");
        }if(h==19){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai20.html");
        }if(h==20){
            webView.loadUrl("file:///android_asset/honnhangiadinh/bai21.html");
        }


    }
}