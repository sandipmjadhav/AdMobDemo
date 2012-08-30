package com.androidmyway.demo.admob;

import android.app.Activity;
import android.os.Bundle;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class AdDemoActivity  extends Activity {
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.main);
	
		    // Look up the AdView as a resource and load a request.
		    // Use following code only if you not following line in xml view of adview
		    //ads:loadAdOnCreate="true"
		    AdView adView = (AdView)this.findViewById(R.id.adView);
		    adView.loadAd(new AdRequest());
	  }
}