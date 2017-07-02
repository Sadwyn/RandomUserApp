
package com.andersen.sadwyn.randomusertest.model.pojos;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Login$$Parcelable
    implements Parcelable, ParcelWrapper<com.andersen.sadwyn.randomusertest.model.pojos.Login>
{

    private com.andersen.sadwyn.randomusertest.model.pojos.Login login$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Login$$Parcelable>CREATOR = new Creator<Login$$Parcelable>() {


        @Override
        public Login$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Login$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Login$$Parcelable[] newArray(int size) {
            return new Login$$Parcelable[size] ;
        }

    }
    ;

    public Login$$Parcelable(com.andersen.sadwyn.randomusertest.model.pojos.Login login$$2) {
        login$$0 = login$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(login$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.andersen.sadwyn.randomusertest.model.pojos.Login login$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(login$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(login$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$1, "sha1"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$1, "password"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$1, "salt"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$1, "sha256"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$1, "username"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$1, "md5"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.andersen.sadwyn.randomusertest.model.pojos.Login getParcel() {
        return login$$0;
    }

    public static com.andersen.sadwyn.randomusertest.model.pojos.Login read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.andersen.sadwyn.randomusertest.model.pojos.Login login$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            login$$4 = new com.andersen.sadwyn.randomusertest.model.pojos.Login();
            identityMap$$1 .put(reservation$$0, login$$4);
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$4, "sha1", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$4, "password", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$4, "salt", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$4, "sha256", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$4, "username", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Login.class, login$$4, "md5", parcel$$3 .readString());
            com.andersen.sadwyn.randomusertest.model.pojos.Login login$$3 = login$$4;
            identityMap$$1 .put(identity$$1, login$$3);
            return login$$3;
        }
    }

}
