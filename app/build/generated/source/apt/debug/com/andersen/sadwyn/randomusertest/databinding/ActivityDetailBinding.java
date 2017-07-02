package com.andersen.sadwyn.randomusertest.databinding;
import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.BR;
import android.view.View;
public class ActivityDetailBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.ImageView bigUserPhoto;
    public final android.widget.TextView city;
    public final android.widget.TextView countryText;
    public final android.widget.TextView email;
    public final android.widget.TextView location;
    private final android.widget.ScrollView mboundView0;
    public final android.widget.TextView name;
    public final android.widget.TextView phoneText;
    public final android.widget.TextView phoneTextMobile;
    public final android.widget.TextView postcode;
    public final android.widget.TextView state;
    public final android.widget.TextView street;
    // variables
    private com.andersen.sadwyn.randomusertest.model.pojos.User mUser;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.bigUserPhoto = (android.widget.ImageView) bindings[2];
        this.city = (android.widget.TextView) bindings[6];
        this.countryText = (android.widget.TextView) bindings[3];
        this.email = (android.widget.TextView) bindings[11];
        this.location = (android.widget.TextView) bindings[4];
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.name = (android.widget.TextView) bindings[1];
        this.name.setTag(null);
        this.phoneText = (android.widget.TextView) bindings[9];
        this.phoneTextMobile = (android.widget.TextView) bindings[10];
        this.postcode = (android.widget.TextView) bindings[8];
        this.state = (android.widget.TextView) bindings[7];
        this.street = (android.widget.TextView) bindings[5];
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
    public com.andersen.sadwyn.randomusertest.model.pojos.User getUser() {
        return mUser;
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

    public static ActivityDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityDetailBinding>inflate(inflater, com.andersen.sadwyn.randomusertest.R.layout.activity_detail, root, attachToRoot, bindingComponent);
    }
    public static ActivityDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDetailBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.andersen.sadwyn.randomusertest.R.layout.activity_detail, null, false), bindingComponent);
    }
    public static ActivityDetailBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDetailBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}