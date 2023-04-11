package joshuuduan.conggiao.giaolyvietnam.ui.socap2;

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
import joshuuduan.conggiao.giaolyvietnam.databinding.FragmentGalleryBinding;
import joshuuduan.conggiao.giaolyvietnam.ui.ContentActivity;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    ListView lv;
    ArrayAdapter<String> adapter;
    private String mParam1;
    private String mParam2;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        String[] storyNames =getActivity().getResources().getStringArray(R.array.so_cap_2);
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        lv=(ListView) view.findViewById(R.id.idListview);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), ContentActivity.class);
                intent.putExtra("So_Cap_II",i);
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