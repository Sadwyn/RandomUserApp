
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
public class Picture$$Parcelable
    implements Parcelable, ParcelWrapper<com.andersen.sadwyn.randomusertest.model.pojos.Picture>
{

    private com.andersen.sadwyn.randomusertest.model.pojos.Picture picture$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Picture$$Parcelable>CREATOR = new Creator<Picture$$Parcelable>() {


        @Override
        public Picture$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Picture$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Picture$$Parcelable[] newArray(int size) {
            return new Picture$$Parcelable[size] ;
        }

    }
    ;

    public Picture$$Parcelable(com.andersen.sadwyn.randomusertest.model.pojos.Picture picture$$2) {
        picture$$0 = picture$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(picture$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.andersen.sadwyn.randomusertest.model.pojos.Picture picture$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(picture$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(picture$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Picture.class, picture$$1, "thumbnail"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Picture.class, picture$$1, "large"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Picture.class, picture$$1, "medium"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.andersen.sadwyn.randomusertest.model.pojos.Picture getParcel() {
        return picture$$0;
    }

    public static com.andersen.sadwyn.randomusertest.model.pojos.Picture read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.andersen.sadwyn.randomusertest.model.pojos.Picture picture$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            picture$$4 = new com.andersen.sadwyn.randomusertest.model.pojos.Picture();
            identityMap$$1 .put(reservation$$0, picture$$4);
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Picture.class, picture$$4, "thumbnail", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Picture.class, picture$$4, "large", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Picture.class, picture$$4, "medium", parcel$$3 .readString());
            com.andersen.sadwyn.randomusertest.model.pojos.Picture picture$$3 = picture$$4;
            identityMap$$1 .put(identity$$1, picture$$3);
            return picture$$3;
        }
    }

}
