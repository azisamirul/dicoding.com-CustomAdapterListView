package azisamirul.listjualmobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailMobilActivity extends AppCompatActivity {
public static String KEY_ITEM="item";
    private TextView txtDetail;
    private ImageView imgDetail;
    private MobilModel item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mobil);

        getSupportActionBar().setTitle("Detail Mobil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtDetail=(TextView) findViewById(R.id.txt_detail);
        imgDetail=(ImageView) findViewById(R.id.img_detail);

        item=(MobilModel) getIntent().getSerializableExtra(KEY_ITEM);
        txtDetail.setText(Html.fromHtml(item.getTitle()+" berharga "+item.getHarga()+"<br>"+
        "di <b>"+item.getLokasi()+"</b>"));

        Picasso.with(DetailMobilActivity.this).load(item.getImage()).into(imgDetail);
    }
}
