package fziviello.viewpager;

/**
 * Created by fziviello on 01/02/18.
 */

public enum ModelPager {

    PAG_1(R.string.pagina_1, R.layout.view_1),
    PAG_2(R.string.pagina_2, R.layout.view_2),
    PAG_3(R.string.pagina_3, R.layout.view_3);

    private int mTitoloResId;
    private int mLayoutResId;

    ModelPager(int mTitoloResId, int mLayoutResId) {
        this.mTitoloResId = mTitoloResId;
        this.mLayoutResId = mLayoutResId;
    }

    public int getTitleResId() {
        return mTitoloResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}