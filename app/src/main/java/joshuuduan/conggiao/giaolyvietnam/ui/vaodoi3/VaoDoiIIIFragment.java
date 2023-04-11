package joshuuduan.conggiao.giaolyvietnam.ui.vaodoi3;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joshuuduan.conggiao.giaolyvietnam.R;

public class VaoDoiIIIFragment extends Fragment {

    private VaoDoiIIIViewModel mViewModel;

    public static VaoDoiIIIFragment newInstance() {
        return new VaoDoiIIIFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vao_doi_i_i_i_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(VaoDoiIIIViewModel.class);
        // TODO: Use the ViewModel
    }

}