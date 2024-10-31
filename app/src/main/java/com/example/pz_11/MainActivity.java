package com.example.pz_11;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Product> products;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products = new ArrayList<>();
        products.add(new Product("Яблоки", 1, "кг"));
        products.add(new Product("Молоко", 2, "л"));
        products.add(new Product("Хлеб", 1, "шт"));

        // Настройка RecyclerView и адаптера
        adapter = new ProductAdapter(this, products);
        RecyclerView recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Настройка панели добавления нового продукта
        EditText productNameInput = findViewById(R.id.productNameInput);
        EditText productUnitInput = findViewById(R.id.productUnitInput);
        Button addProductButton = findViewById(R.id.addProductButton);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = productNameInput.getText().toString();
                String unit = productUnitInput.getText().toString();

                if (!name.isEmpty() && !unit.isEmpty()) {
                    // Добавляем новый продукт в список и уведомляем адаптер
                    products.add(new Product(name, 1, unit));
                    adapter.notifyItemInserted(products.size() - 1);

                    // Очищаем поля ввода
                    productNameInput.setText("");
                    productUnitInput.setText("");
                }
            }
        });
    }
}
