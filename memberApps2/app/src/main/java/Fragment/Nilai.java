package Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.memberapps2.R;

import adapter.NilaiAdapter;

public class Nilai extends Fragment {
    ListView lv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[][] title = new String[][]{
                {"Bimbingan Studi Qur'an ", "Tema Pendidikan", "Hasil : A", "ic_menu_home"},
                {"Studi Islam Intensif", "Tema Pendidikan", "Hasil : B", "ic_menu_home"},
                {"Bimbingan Studi Qur'an", "", "08.00 - 10.00 | Hadir", "ic_menu_home"},
                {"Studi Islam Intensif", "Tema Pendidikan", "10.00 - 12.00 | Tidak Hadir", "ic_menu_home"},
                {"Bimbingan Studi Qur'an ", "Tema Pendidikan", "Hasil : A", "ic_menu_home"},
                {"Studi Islam Intensif", "Tema Pendidikan", "Hasil : B", "ic_menu_home"},
                {"Bimbingan Studi Qur'an", "", "08.00 - 10.00 | Hadir", "ic_menu_home"},
                {"Studi Islam Intensif", "Tema Pendidikan", "10.00 - 12.00 | Tidak Hadir", "ic_menu_home"}

        };

        View view = inflater.inflate(R.layout.fragment_nilai, container, false);
        lv = (ListView) view.findViewById(R.id.listView4);
        NilaiAdapter adapter = new NilaiAdapter(this.getActivity(), title);
//        ArrayAdapter<String> adapterlistmenu = new ArrayAdapter<String>(getActivity(), R.layout.mylist, R.id.Itemname, title);
        lv.setAdapter(adapter);

        return view;
    }

}
