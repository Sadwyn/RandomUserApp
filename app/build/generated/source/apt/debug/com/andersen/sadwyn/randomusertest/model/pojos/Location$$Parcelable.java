
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
public class Location$$Parcelable
    implements Parcelable, ParcelWrapper<com.andersen.sadwyn.randomusertest.model.pojos.Location>
{

    private com.andersen.sadwyn.randomusertest.model.pojos.Location location$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Location$$Parcelable>CREATOR = new Creator<Location$$Parcelable>() {


        @Override
        public Location$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Location$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Location$$Parcelable[] newArray(int size) {
            return new Location$$Parcelable[size] ;
        }

    }
    ;

    public Location$$Parcelable(com.andersen.sadwyn.randomusertest.model.pojos.Location location$$2) {
        location$$0 = location$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(location$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.andersen.sadwyn.randomusertest.model.pojos.Location location$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(location$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(location$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$1, "city"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$1, "street"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$1, "postcode"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$1, "state"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.andersen.sadwyn.randomusertest.model.pojos.Location getParcel() {
        return location$$0;
    }

    public static com.andersen.sadwyn.randomusertest.model.pojos.Location read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.andersen.sadwyn.randomusertest.model.pojos.Location location$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            location$$4 = new com.andersen.sadwyn.randomusertest.model.pojos.Location();
            identityMap$$1 .put(reservation$$0, location$$4);
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$4, "city", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$4, "street", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$4, "postcode", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Location.class, location$$4, "state", parcel$$3 .readString());
            com.andersen.sadwyn.randomusertest.model.pojos.Location location$$3 = location$$4;
            identityMap$$1 .put(identity$$1, location$$3);
            return location$$3;
        }
    }

}
