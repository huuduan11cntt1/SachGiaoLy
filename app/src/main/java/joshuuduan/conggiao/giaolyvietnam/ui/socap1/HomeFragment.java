package joshuuduan.conggiao.giaolyvietnam.ui.socap1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import joshuuduan.conggiao.giaolyvietnam.R;
import joshuuduan.conggiao.giaolyvietnam.databinding.FragmentHomeBinding;
import joshuuduan.conggiao.giaolyvietnam.ui.MainHTML;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    ListView lv;
    ArrayAdapter<String> adapter;
    private String mParam1;
    private String mParam2;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public HomeFragment(){

    }
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        String[] storyNames =getActivity().getResources().getStringArray(R.array.stories_names);
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), MainHTML.class);
                intent.putExtra("So_Cap_I",i);
                startActivity(intent);
            }
        });



        adapter=new ArrayAdapter<>(getActivity(),R.layout.row_item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}