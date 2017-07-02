
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
public class Name$$Parcelable
    implements Parcelable, ParcelWrapper<com.andersen.sadwyn.randomusertest.model.pojos.Name>
{

    private com.andersen.sadwyn.randomusertest.model.pojos.Name name$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Name$$Parcelable>CREATOR = new Creator<Name$$Parcelable>() {


        @Override
        public Name$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Name$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Name$$Parcelable[] newArray(int size) {
            return new Name$$Parcelable[size] ;
        }

    }
    ;

    public Name$$Parcelable(com.andersen.sadwyn.randomusertest.model.pojos.Name name$$2) {
        name$$0 = name$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(name$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.andersen.sadwyn.randomusertest.model.pojos.Name name$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(name$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(name$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Name.class, name$$1, "last"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Name.class, name$$1, "title"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.andersen.sadwyn.randomusertest.model.pojos.Name.class, name$$1, "first"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.andersen.sadwyn.randomusertest.model.pojos.Name getParcel() {
        return name$$0;
    }

    public static com.andersen.sadwyn.randomusertest.model.pojos.Name read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.andersen.sadwyn.randomusertest.model.pojos.Name name$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            name$$4 = new com.andersen.sadwyn.randomusertest.model.pojos.Name();
            identityMap$$1 .put(reservation$$0, name$$4);
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Name.class, name$$4, "last", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Name.class, name$$4, "title", parcel$$3 .readString());
            InjectionUtil.setField(com.andersen.sadwyn.randomusertest.model.pojos.Name.class, name$$4, "first", parcel$$3 .readString());
            com.andersen.sadwyn.randomusertest.model.pojos.Name name$$3 = name$$4;
            identityMap$$1 .put(identity$$1, name$$3);
            return name$$3;
        }
    }

}
