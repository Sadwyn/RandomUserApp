package com.andersen.sadwyn.randomusertest.databinding;
import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.BR;
import android.view.View;
public class ActivityDetailBindingLandImpl extends ActivityDetailBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.big_user_photo, 2);
        sViewsWithIds.put(R.id.country_text, 3);
        sViewsWithIds.put(R.id.location, 4);
        sViewsWithIds.put(R.id.street, 5);
        sViewsWithIds.put(R.id.city, 6);
        sViewsWithIds.put(R.id.state, 7);
        sViewsWithIds.put(R.id.postcode, 8);
        sViewsWithIds.put(R.id.phoneText, 9);
        sViewsWithIds.put(R.id.phoneTextMobile, 10);
        sViewsWithIds.put(R.id.email, 11);
    }
    // views
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.user :
                setUser((com.andersen.sadwyn.randomusertest.model.pojos.User) variable);
                return true;
        }
        return false;
    }

    public void setUser(com.andersen.sadwyn.randomusertest.model.pojos.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.andersen.sadwyn.randomusertest.model.pojos.Name userName = null;
        java.lang.String userNameFirstSubstringInt0Int1ToUpperCase = null;
        java.lang.String userNameLast = null;
        java.lang.String userNameFirstSubstringInt0Int1 = null;
        java.lang.String userNameLastSubstringInt0Int1 = null;
        java.lang.String userNameLastSubstringInt1 = null;
        java.lang.String userNameFirst = null;
        java.lang.String userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1CharUserNameLastSubstringInt0Int1ToUpperCaseUserNameLastSubstringInt1 = null;
        java.lang.String userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1CharUserNameLastSubstringInt0Int1ToUpperCase = null;
        com.andersen.sadwyn.randomusertest.model.pojos.User user = mUser;
        java.lang.String userNameFirstSubstringInt1 = null;
        java.lang.String userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1 = null;
        java.lang.String userNameLastSubstringInt0Int1ToUpperCase = null;
        java.lang.String userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1Char = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                }


                if (userName != null) {
                    // read user.name.last
                    userNameLast = userName.getLast();
                    // read user.name.first
                    userNameFirst = userName.getFirst();
                }


                if (userNameLast != null) {
                    // read user.name.last.substring(0, 1)
                    userNameLastSubstringInt0Int1 = userNameLast.substring(0, 1);
                    // read user.name.last.substring(1)
                    userNameLastSubstringInt1 = userNameLast.substring(1);
                }
                if (userNameFirst != null) {
                    // read user.name.first.substring(0, 1)
                    userNameFirstSubstringInt0Int1 = userNameFirst.substring(0, 1);
                    // read user.name.first.substring(1)
                    userNameFirstSubstringInt1 = userNameFirst.substring(1);
                }


                if (userNameLastSubstringInt0Int1 != null) {
                    // read user.name.last.substring(0, 1).toUpperCase()
                    userNameLastSubstringInt0Int1ToUpperCase = userNameLastSubstringInt0Int1.toUpperCase();
                }
                if (userNameFirstSubstringInt0Int1 != null) {
                    // read user.name.first.substring(0, 1).toUpperCase()
                    userNameFirstSubstringInt0Int1ToUpperCase = userNameFirstSubstringInt0Int1.toUpperCase();
                }


                // read (user.name.first.substring(0, 1).toUpperCase()) + (user.name.first.substring(1))
                userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1 = (userNameFirstSubstringInt0Int1ToUpperCase) + (userNameFirstSubstringInt1);


                // read ((user.name.first.substring(0, 1).toUpperCase()) + (user.name.first.substring(1))) + (' ')
                userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1Char = (userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1) + (' ');


                // read (((user.name.first.substring(0, 1).toUpperCase()) + (user.name.first.substring(1))) + (' ')) + (user.name.last.substring(0, 1).toUpperCase())
                userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1CharUserNameLastSubstringInt0Int1ToUpperCase = (userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1Char) + (userNameLastSubstringInt0Int1ToUpperCase);


                // read ((((user.name.first.substring(0, 1).toUpperCase()) + (user.name.first.substring(1))) + (' ')) + (user.name.last.substring(0, 1).toUpperCase())) + (user.name.last.substring(1))
                userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1CharUserNameLastSubstringInt0Int1ToUpperCaseUserNameLastSubstringInt1 = (userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1CharUserNameLastSubstringInt0Int1ToUpperCase) + (userNameLastSubstringInt1);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, userNameFirstSubstringInt0Int1ToUpperCaseUserNameFirstSubstringInt1CharUserNameLastSubstringInt0Int1ToUpperCaseUserNameLastSubstringInt1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}