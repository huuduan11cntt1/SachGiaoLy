package joshuuduan.conggiao.giaolyvietnam.ui.vaodoi1;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import joshuuduan.conggiao.giaolyvietnam.R;

public class VaoDoiIFragment extends Fragment {

    private VaoDoiIViewModel mViewModel;
    ListView lv;
    ArrayAdapter<String> adapter;
    public static VaoDoiIFragment newInstance() {
        return new VaoDoiIFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String[] storyNames =getActivity().getResources().getStringArray(R.array.vao_doi_1);
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);
        adapter=new ArrayAdapter<>(getActivity(),R.layout.row_item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(VaoDoiIViewModel.class);
        // TODO: Use the ViewModel
    }

}