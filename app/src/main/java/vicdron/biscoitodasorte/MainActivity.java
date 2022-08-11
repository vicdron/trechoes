package vicdron.biscoitodasorte;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import vicdron.biscoitodasorte.Fragment.FilmesFragment;
import vicdron.biscoitodasorte.Fragment.LivrosFragment;
import vicdron.biscoitodasorte.Fragment.MusicaFragment;
import vicdron.biscoitodasorte.Fragment.SeriesFragment;

public class MainActivity extends AppCompatActivity {
    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.smartTabLayout = (SmartTabLayout) findViewById(R.id.smartTabLayout);
        this.viewPager = (ViewPager) findViewById(R.id.viewpager);
        ((AdView) findViewById(R.id.adView)).loadAd(new AdRequest.Builder().build());
        this.viewPager.setAdapter(new FragmentPagerItemAdapter(getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("\uD83C\uDFA4\uD83C\uDFBC Músicas", MusicaFragment.class)
                .add("\uD83D\uDCFA\uD83D\uDCFA Séries", SeriesFragment.class)
                .add("\uD83C\uDFAC\uD83C\uDFA5 Filmes", FilmesFragment.class)
                .add("\uD83D\uDCD6\uD83D\uDCDA Livros", LivrosFragment.class).create()));
        this.smartTabLayout.setViewPager(this.viewPager);
    }
}
