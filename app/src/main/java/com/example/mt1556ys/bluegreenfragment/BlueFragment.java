package com.example.mt1556ys.bluegreenfragment;

        import android.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.ViewGroup;
        import android.os.Bundle;
        import android.view.View;

/**
 * Created by mt1556ys on 9/28/15.
 */
public class BlueFragment extends Fragment{

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.blue_fragment, container, false);
    }
}
