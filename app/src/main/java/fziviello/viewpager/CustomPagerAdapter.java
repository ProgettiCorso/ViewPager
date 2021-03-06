package fziviello.viewpager;

/**
 * Created by fziviello on 01/02/18.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelPager modelPager = ModelPager.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelPager.getLayoutResId(), collection, false);
        collection.addView(layout);

        TextView txt_page = layout.findViewById(R.id.txt_page);
        txt_page.setText(modelPager.getTitleResId());

        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelPager.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelPager customPagerEnum = ModelPager.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}