package com.duyp.architecture.mvp.utils;

import android.arch.lifecycle.LiveData;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.duyp.androidutils.functions.PlainConsumer;
import com.duyp.androidutils.navigator.ChildFragmentNavigator;
import com.duyp.androidutils.navigator.FragmentNavigator;
import com.duyp.androidutils.navigator.Navigator;
import com.duyp.architecture.mvp.data.model.User;
import com.duyp.architecture.mvp.ui.login.LoginFragment;
import com.duyp.architecture.mvp.ui.profile.ProfileFragment;
import com.duyp.architecture.mvp.ui.repositories.RepositoriesFragment;

import lombok.AllArgsConstructor;

/**
 * Created by duypham on 9/7/17.
 * Util class for navigating common page in application
 */

@AllArgsConstructor
public class NavigatorHelper {

    private static final String TAG_LOGIN = "TAG_LOGIN";
    private static final String TAG_PROFILE = "TAG_PROFILE";
    private static final String TAG_ALL_REPO = "TAG_ALL_REPO";

    Navigator mNavigator;

    public void navigateUserProfile(@IdRes int containerId) {
        ProfileFragment fragment = mNavigator.findFragmentByTag(TAG_PROFILE);
        if (fragment == null) {
            fragment = new ProfileFragment();
        }
        mNavigator.replaceFragment(containerId, fragment, TAG_PROFILE, null);
    }

    public void replaceLoginFragment(@IdRes int containerId) {
        LoginFragment fragment = mNavigator.findFragmentByTag(TAG_LOGIN);
        if (fragment == null) {
            fragment = new LoginFragment();
        }
        mNavigator.replaceFragment(containerId, fragment, TAG_LOGIN, null);
    }
    
    public void replaceAllRepositoriesFragment(@IdRes int containerId) {
        RepositoriesFragment fragment = mNavigator.findFragmentByTag(TAG_ALL_REPO);
        if (fragment == null) {
            fragment = new RepositoriesFragment();
        }
        mNavigator.replaceFragment(containerId, fragment, TAG_ALL_REPO, null);
    }
}