package joshuuduan.conggiao.giaolyvietnam.ui.honnhangiadinh;

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
import joshuuduan.conggiao.giaolyvietnam.ui.HonNhanCongGiaoHtml;

public class HonNhanFragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;

    private HonNhanViewModel mViewModel;

    public static HonNhanFragment newInstance() {
        return new HonNhanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        String[] sTori = getActivity().getResources().getStringArray(R.array.hon_nhan_gia_dinh);
        View view = inflater.inflate(R.layout.hon_nhan_fragment,container,false);
        listView = (ListView) view.findViewById(R.id.listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), HonNhanCongGiaoHtml.class);
                intent.putExtra("hon_nhan_gia_dinh", i);
                startActivity(intent);
            }
        });

        adapter = new ArrayAdapter<>(getActivity(),R.layout.row_item,R.id.row_txt,sTori);
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HonNhanViewModel.class);
        // TODO: Use the ViewModel
    }

}