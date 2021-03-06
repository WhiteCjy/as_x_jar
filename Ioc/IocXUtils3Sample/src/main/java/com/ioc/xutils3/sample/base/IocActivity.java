package com.ioc.xutils3.sample.base;

import android.os.Bundle;
import android.view.Window;

import com.yline.base.BaseActivity;

/**
 * Activity中注入
 * zc.view().inject(this);
 * zc.view().inject(mHolder,this.getWindow().getDecorView());
 */
public class IocActivity extends BaseActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		if (IocApplication.isInject)
		{
			x.view().inject(this);
		}
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	}
}
