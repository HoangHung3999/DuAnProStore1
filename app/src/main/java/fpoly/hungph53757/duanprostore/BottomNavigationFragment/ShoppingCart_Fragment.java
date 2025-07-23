package fpoly.hungph53757.duanprostore.BottomNavigationFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import fpoly.hungph53757.duanprostore.R;
import fpoly.hungph53757.duanprostore.adapter.ShoppingCart_Adapter;
import fpoly.hungph53757.duanprostore.model.ShoppingCart_Model;


public class ShoppingCart_Fragment extends Fragment {

    RecyclerView recyclerView_shoppingCart;
    TextView txt_shoppingCart_tonggiatien;
    Button btn_shoppingCart_thanhtoan;
    ArrayList<ShoppingCart_Model> arrayList_ShoppingCart;
    ShoppingCart_Adapter shoppingCartAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shopping_cart_, container, false);
        recyclerView_shoppingCart = view.findViewById(R.id.recyclerView_shoppingCart);
        txt_shoppingCart_tonggiatien = view.findViewById(R.id.txt_shoppingCart_tonggiatien);
        btn_shoppingCart_thanhtoan = view.findViewById(R.id.btn_shoppingCart_thanhtoan);

        arrayList_ShoppingCart = new ArrayList<>();
        arrayList_ShoppingCart.add(new ShoppingCart_Model( R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));
        arrayList_ShoppingCart.add(new ShoppingCart_Model(R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));
        arrayList_ShoppingCart.add(new ShoppingCart_Model(R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));
        arrayList_ShoppingCart.add(new ShoppingCart_Model(R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));
        arrayList_ShoppingCart.add(new ShoppingCart_Model(R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));


        shoppingCartAdapter = new ShoppingCart_Adapter(getContext(),arrayList_ShoppingCart);
        recyclerView_shoppingCart.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_shoppingCart.setAdapter(shoppingCartAdapter);
        return view;
    }
}