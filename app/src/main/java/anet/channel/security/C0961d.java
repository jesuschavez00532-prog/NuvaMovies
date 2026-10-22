package anet.channel.security;

/* renamed from: anet.channel.security.d */
/* loaded from: classes.dex */
final class C0961d implements ISecurityFactory {
    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createNonSecurity(String str) {
        return new C0958a(str);
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createSecurity(String str) {
        return new C0959b(str);
    }
}
