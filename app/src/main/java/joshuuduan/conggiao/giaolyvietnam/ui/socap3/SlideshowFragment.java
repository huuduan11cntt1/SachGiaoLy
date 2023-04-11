package joshuuduan.conggiao.giaolyvietnam.ui.socap3;

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
import androidx.lifecycle.ViewModelProvider;

import joshuuduan.conggiao.giaolyvietnam.R;
import joshuuduan.conggiao.giaolyvietnam.databinding.FragmentSlideshowBinding;
import joshuuduan.conggiao.giaolyvietnam.ui.CanBan4HTML;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    ListView lv;
    ArrayAdapter<String> adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        String[] storyNames =getActivity().getResources().getStringArray(R.array.so_cap_3);
        View view=inflater.inflate(R.layout.so_cap_i_i_i_fragment,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), CanBan4HTML.class);
                intent.putExtra("CanBan4",i);
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