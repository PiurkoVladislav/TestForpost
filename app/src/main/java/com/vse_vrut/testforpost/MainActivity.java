package com.vse_vrut.testforpost;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private List<DeskItem> mDeskItems;

    private FragmentTable mFragmentTable;
    private FragmentDesk mFragmentDesk;
    private FragmentTeams mFragmentTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        mFragmentTable = new FragmentTable();
        mFragmentDesk = new FragmentDesk();
        mFragmentTeams = new FragmentTeams();

        mViewPagerAdapter.addFragment(mFragmentTable, getString(R.string.table_title));
        mViewPagerAdapter.addFragment(mFragmentDesk, getString(R.string.desk_title));
        mViewPagerAdapter.addFragment(mFragmentTeams, getString(R.string.teams_title));

        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mDeskItems = new ArrayList<>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cleaner:
                mDeskItems.add(new DeskItem(getString(R.string.cleaner),getString(R.string.details),R.drawable.print_cleaner));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.defeatist:
                mDeskItems.add(new DeskItem(getString(R.string.defeatist),getString(R.string.details),R.drawable.print_defeatist));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.fumbler:
                mDeskItems.add(new DeskItem(getString(R.string.fumbler),getString(R.string.details),R.drawable.print_fumbler));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.humanist:
                mDeskItems.add(new DeskItem(getString(R.string.humanist),getString(R.string.details),R.drawable.print_humanist));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.invulnerable:
                mDeskItems.add(new DeskItem(getString(R.string.invulnerable),getString(R.string.details),R.drawable.print_invulnerable));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.irresistible:
                mDeskItems.add(new DeskItem(getString(R.string.irresistible),getString(R.string.details),R.drawable.print_irresistible));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.sloth:
                mDeskItems.add(new DeskItem(getString(R.string.sloth),getString(R.string.details),R.drawable.print_sloth));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.sniper:
                mDeskItems.add(new DeskItem(getString(R.string.sniper),getString(R.string.details),R.drawable.print_sniper));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.stormtrooper:
                mDeskItems.add(new DeskItem(getString(R.string.stormtrooper),getString(R.string.details),R.drawable.print_stormtrooper));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            case R.id.victim:
                mDeskItems.add(new DeskItem(getString(R.string.victim),getString(R.string.details),R.drawable.print_victim));
                mFragmentDesk.updateUI(mDeskItems);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
