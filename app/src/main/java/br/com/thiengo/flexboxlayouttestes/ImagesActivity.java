package br.com.thiengo.flexboxlayouttestes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;

import java.util.ArrayList;

public class ImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        initRecycler();
    }

    private void initRecycler(){
        RecyclerView rvFilmes = (RecyclerView) findViewById(R.id.rv_images);
        rvFilmes.setHasFixedSize(true);

        /*GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        rvFilmes.setLayoutManager( layoutManager );*/

        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager();
        layoutManager.setFlexWrap( FlexWrap.WRAP );
        layoutManager.setAlignItems( AlignItems.STRETCH );
        layoutManager.setFlexDirection( FlexDirection.ROW );
        rvFilmes.setLayoutManager( layoutManager );

        ImagesAdapter adapter = new ImagesAdapter( this, getImages() );
        rvFilmes.setAdapter( adapter );
    }

    private ArrayList<String> getImages(){
        ArrayList<String> images = new ArrayList<>();

        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/2e0qa5pr9fvfbis30trqvhdve2ee5bea420225c9c3a18641f25e162546.png");
        images.add("http://farm4.static.flickr.com/3338/5814830959_ab997f2ec8.jpg");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/hjrfdbrhponuri1gkh2j6aulg28fc7ac9756f6a2d013063c4e0e765f8b.png");
        images.add("http://www.sepeb.com/android-background-wallpaper/image_20170221_111300.jpg");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/0aikoahvlu4fni45h7ikdpes943a8aff32d1487415fb928c2ce0ca11b4.png");
        images.add("https://c2.staticflickr.com/4/3717/12725574243_d692209247_b.jpg");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/8ik5m37g9jjv05gr60bvd41dj7789ba2cd800eed6523da0d8cc4969fa3.png");
        images.add("http://img08.deviantart.net/3994/i/2012/135/7/2/android_background_by_chrisz0rz-d4zuzx1.jpg");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/vhip6sv6faonqi3pnumdioi45655ebf994455d144ceebe3053e73ff826.png");
        images.add("http://kingofwallpapers.com/background-pics-for-android/background-pics-for-android-007.jpg");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/3rspsicec81qif7c5ffnkt1gn1bf22be5a6a4819be25b832721e470db7.png");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/3calv0a9lf80onidvnmsqmccj1b60ef32453778782be0996f73c4634f2.png");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/bvu1h3uqglap0511rgciakf6r79a3b476ad4adbd89218516de0b638c41.png");
        images.add("http://www.thiengo.com.br/img/post/facebook/650-366/sld4h9iqsfnt6k5hp1uqcsd651a184a379fdbcb9d8e7806d24e41cc7ae.png");

        return images;
    }
}
