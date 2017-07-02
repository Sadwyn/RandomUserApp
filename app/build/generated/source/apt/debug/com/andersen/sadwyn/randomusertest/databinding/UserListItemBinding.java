package com.andersen.sadwyn.randomusertest.databinding;
import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.BR;
import android.view.View;
public class UserListItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView countryText;
    public final android.widget.RelativeLayout userHolder;
    public final de.hdodenhof.circleimageview.CircleImageView userLittlePhoto;
    public final android.widget.TextView userName;
    // variables
    private com.andersen.sadwyn.randomusertest.model.pojos.User mUser;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserListItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.countryText = (android.widget.TextView) bindings[3];
        this.countryText.setTag(null);
        this.userHolder = (android.widget.RelativeLayout) bindings[0];
        this.userHolder.setTag(null);
        this.userLittlePhoto = (de.hdodenhof.circleimageview.CircleImageView) bindings[1];
        this.userLittlePhoto.setTag(null);
        this.userName = (android.widget.TextView) bindings[2];
        this.userName.setTag(null);
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
        com.andersen.sadwyn.randomusertest.model.pojos.Picture userPicture = null;
        java.lang.String userNameFirst = null;
        java.lang.String userNat = null;
        java.lang.String userNameTitle = null;
        java.lang.String userPictureThumbnail = null;
        com.andersen.sadwyn.randomusertest.model.pojos.User user = mUser;
        java.lang.String userNameTitleCharCharUserNameFirst = null;
        java.lang.String userNameTitleCharChar = null;
        java.lang.String userNameTitleChar = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                    // read user.picture
                    userPicture = user.getPicture();
                    // read user.nat
                    userNat = user.getNat();
                }


                if (userName != null) {
                    // read user.name.first
                    userNameFirst = userName.getFirst();
                    // read user.name.title
                    userNameTitle = userName.getTitle();
                }
                if (userPicture != null) {
                    // read user.picture.thumbnail
                    userPictureThumbnail = userPicture.getThumbnail();
                }


                // read (user.name.title) + ('.')
                userNameTitleChar = (userNameTitle) + ('.');


                // read ((user.name.title) + ('.')) + (' ')
                userNameTitleCharChar = (userNameTitleChar) + (' ');


                // read (((user.name.title) + ('.')) + (' ')) + (user.name.first)
                userNameTitleCharCharUserNameFirst = (userNameTitleCharChar) + (userNameFirst);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.countryText, userNat);
            com.andersen.sadwyn.randomusertest.ui.adapters.UserAdapter.bindThumbnail(this.userLittlePhoto, userPictureThumbnail);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.userName, userNameTitleCharCharUserNameFirst);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static UserListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static UserListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<UserListItemBinding>inflate(inflater, com.andersen.sadwyn.randomusertest.R.layout.user_list_item, root, attachToRoot, bindingComponent);
    }
    public static UserListItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static UserListItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.andersen.sadwyn.randomusertest.R.layout.user_list_item, null, false), bindingComponent);
    }
    public static UserListItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static UserListItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/user_list_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new UserListItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}