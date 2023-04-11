package joshuuduan.conggiao.giaolyvietnam.ui.canban2;

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
import joshuuduan.conggiao.giaolyvietnam.ui.CanBanII_HTML;

public class CanBanIIFragment extends Fragment {

    private CanBanIIViewModel mViewModel;
    ListView lv;
    ArrayAdapter<String> adapter;

    public static CanBanIIFragment newInstance() {
        return new CanBanIIFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String[] storyNames =getActivity().getResources().getStringArray(R.array.can_ban_2);
        View view=inflater.inflate(R.layout.can_ban_i_fragment,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(getActivity(), CanBanII_HTML.class);
                intent.putExtra("CanBanII",i);
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
        mViewModel = new ViewModelProvider(this).get(CanBanIIViewModel.class);
        // TODO: Use the ViewModel
    }

}