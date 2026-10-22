package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.p */
/* loaded from: classes.dex */
public class C1616p extends AbstractC1612l {

    /* renamed from: d */
    private static final UriMatcher f6419d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6419d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C1616p(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: h */
    private InputStream m7452h(Uri uri, ContentResolver contentResolver) {
        int match = f6419d.match(uri);
        if (match != 1) {
            if (match != 3) {
                if (match != 5) {
                    return contentResolver.openInputStream(uri);
                }
            } else {
                return m7453i(contentResolver, uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m7453i(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: i */
    private InputStream m7453i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: a */
    public Class mo7418a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC1612l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo7419c(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC1612l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputStream mo7420e(Uri uri, ContentResolver contentResolver) {
        InputStream m7452h = m7452h(uri, contentResolver);
        if (m7452h != null) {
            return m7452h;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
