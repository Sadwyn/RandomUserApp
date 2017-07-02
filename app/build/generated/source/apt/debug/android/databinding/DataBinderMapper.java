
package android.databinding;
import com.andersen.sadwyn.randomusertest.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 23;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.andersen.sadwyn.randomusertest.R.layout.activity_main:
                    return com.andersen.sadwyn.randomusertest.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.andersen.sadwyn.randomusertest.R.layout.activity_detail:
                    return com.andersen.sadwyn.randomusertest.databinding.ActivityDetailBinding.bind(view, bindingComponent);
                case com.andersen.sadwyn.randomusertest.R.layout.user_list_item:
                    return com.andersen.sadwyn.randomusertest.databinding.UserListItemBinding.bind(view, bindingComponent);
                case com.andersen.sadwyn.randomusertest.R.layout.progress_item:
                    return com.andersen.sadwyn.randomusertest.databinding.ProgressItemBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.andersen.sadwyn.randomusertest.R.layout.activity_main;
                }
                break;
            }
            case 257710925: {
                if(tag.equals("layout/activity_detail_0")) {
                    return com.andersen.sadwyn.randomusertest.R.layout.activity_detail;
                }
                break;
            }
            case 919223958: {
                if(tag.equals("layout/user_list_item_0")) {
                    return com.andersen.sadwyn.randomusertest.R.layout.user_list_item;
                }
                break;
            }
            case -1290006671: {
                if(tag.equals("layout/progress_item_0")) {
                    return com.andersen.sadwyn.randomusertest.R.layout.progress_item;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"user"};
    }
}