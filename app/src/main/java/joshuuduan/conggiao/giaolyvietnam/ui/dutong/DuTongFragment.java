package joshuuduan.conggiao.giaolyvietnam.ui.dutong;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import joshuuduan.conggiao.giaolyvietnam.R;
import joshuuduan.conggiao.giaolyvietnam.ui.DuTongActivityHTML;

public class DuTongFragment extends Fragment {

    private DuTongViewModel mViewModel;
    ListView lv;
    ArrayAdapter<String> adapter;

    public static DuTongFragment newInstance() {
        return new DuTongFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String[] storyNames =getActivity().getResources().getStringArray(R.array.giao_ly_du_tong);
        View view=inflater.inflate(R.layout.du_tong_fragment,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Intent intent = new Intent(getActivity(), DuTongActivityHTML.class);
                intent.putExtra("DuTong",i);
                startActivity(intent);
            }
        });

        adapter=new ArrayAdapter<>(getActivity(),R.layout.row_item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DuTongViewModel.class);
        // TODO: Use the ViewModel
    }

}