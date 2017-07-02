
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
public class Id$$Parcelable
    implements Parcelable, ParcelWrapper<com.andersen.sadwyn.randomusertest.model.pojos.Id>
{

    private com.andersen.sadwyn.randomusertest.model.pojos.Id id$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Id$$Parcelable>CREATOR = new Creator<Id$$Parcelable>() {


        @Override
        public Id$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Id$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Id$$Parcelable[] newArray(int size) {
            return new Id$$Parcelable[size] ;
        }

    }
    ;

    public Id$$Parcelable(com.andersen.sadwyn.randomusertest.model.pojos.Id id$$2) {
        id$$0 = id$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(id$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.andersen.sadwyn.randomusertest.model.pojos.Id id$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(id$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(id$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Id.class, id$$1, "name"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Id.class, id$$1, "value"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.andersen.sadwyn.randomusertest.model.pojos.Id getParcel() {
        return id$$0;
    }

    public static com.andersen.sadwyn.randomusertest.model.pojos.Id read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.andersen.sadwyn.randomusertest.model.pojos.Id id$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            id$$4 = new com.andersen.sadwyn.randomusertest.model.pojos.Id();
            identityMap$$1 .put(reservation$$0, id$$4);
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Id.class, id$$4, "name", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Id.class, id$$4, "value", parcel$$3 .readString());
            com.andersen.sadwyn.randomusertest.model.pojos.Id id$$3 = id$$4;
            identityMap$$1 .put(identity$$1, id$$3);
            return id$$3;
        }
    }

}
