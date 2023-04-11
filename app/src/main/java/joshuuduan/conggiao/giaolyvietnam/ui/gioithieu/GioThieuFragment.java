package joshuuduan.conggiao.giaolyvietnam.ui.gioithieu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


import joshuuduan.conggiao.giaolyvietnam.R;

import joshuuduan.conggiao.giaolyvietnam.databinding.GioThieuFragmentBinding;

public class GioThieuFragment extends Fragment {


    private GioThieuFragmentBinding binding;

    private GioThieuViewModel mViewModel;

    public static GioThieuFragment newInstance() {
        return new GioThieuFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mViewModel =(GioThieuViewModel) new ViewModelProvider(this).get(GioThieuViewModel.class);

        binding = GioThieuFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final  WebView webView = binding.idWebViewGT;
        webView.loadUrl("file:///android_asset/socap1/giaoly.html");
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GioThieuViewModel.class);
        // TODO: Use the ViewModel
    }

}