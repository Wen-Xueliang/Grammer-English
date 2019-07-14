package eng.lab.englishgrammer.utils;

public enum Symbol {

    //元音
    i_c("i:"),
    I("I"),
    e("e"),
    ae("æ"),
    e_u_c("ə:"),
    e_u("ə"),
    v_u("∧"),
    a_c("a:"),
    c_u("כ"),
    c_u_c("כ:"),
    u("u"),
    u_c("u:"),
    eI("eI"),
    aI("aI"),
    c_uI("כI"),
    e_cu("əu"),
    au("au"),
    Ie_u("Iə"),
    e_be_u("εə"),
    ue_u("uə"),

    //辅音
    p("p"),
    b("b"),
    t("t"),
    d("d"),
    k("k"),
    g("g"),
    f("f"),
    v("v"),
    s("s"),
    z("z"),
    th("θ"),
    q_u("δ"),
    shi("∫"),
    e_b_u("з"),
    h("h"),
    r("r"),
    tshi("t∫"),
    de_b_u("dз"),
    tr("tr"),
    dr("dr"),
    ts("ts"),
    dz("dz"),
    m("m"),
    n("n"),
    n_l("ŋ"),
    l("l"),
    w("w"),
    j("j");

    public String value;

    Symbol(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isVowel() {
        return true;
    }
}
