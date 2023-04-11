package joshuuduan.conggiao.giaolyvietnam.ui.canban3;

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

public class CanBanIIIFragment extends Fragment {

    private CanBanIIIViewModel mViewModel;
    ListView lv;
    ArrayAdapter<String> adapter;

    public static CanBanIIIFragment newInstance() {
        return new CanBanIIIFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String[] storyNames =getActivity().getResources().getStringArray(R.array.can_ban_3);
        View view=inflater.inflate(R.layout.can_ban_i_i_fragment,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);
        adapter=new ArrayAdapter<>(getActivity(),R.layout.row_item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CanBanIIIViewModel.class);
        // TODO: Use the ViewModel
    }

}