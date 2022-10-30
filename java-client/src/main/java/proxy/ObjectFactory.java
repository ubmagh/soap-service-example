
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Account_QNAME = new QName("http://ws/", "Account");
    private final static QName _AccountsList_QNAME = new QName("http://ws/", "AccountsList");
    private final static QName _AccountsListResponse_QNAME = new QName("http://ws/", "AccountsListResponse");
    private final static QName _Convert_QNAME = new QName("http://ws/", "Convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://ws/", "ConvertResponse");
    private final static QName _GetAccount_QNAME = new QName("http://ws/", "GetAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws/", "GetAccountResponse");
    private final static QName _GetSymbols_QNAME = new QName("http://ws/", "GetSymbols");
    private final static QName _GetSymbolsResponse_QNAME = new QName("http://ws/", "GetSymbolsResponse");
    private final static QName _SymbolsWrapper_QNAME = new QName("http://ws/", "SymbolsWrapper");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SymbolsWrapper }
     * 
     * @return
     *     the new instance of {@link SymbolsWrapper }
     */
    public SymbolsWrapper createSymbolsWrapper() {
        return new SymbolsWrapper();
    }

    /**
     * Create an instance of {@link SymbolsWrapper.Symbols }
     * 
     * @return
     *     the new instance of {@link SymbolsWrapper.Symbols }
     */
    public SymbolsWrapper.Symbols createSymbolsWrapperSymbols() {
        return new SymbolsWrapper.Symbols();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link AccountsList }
     * 
     * @return
     *     the new instance of {@link AccountsList }
     */
    public AccountsList createAccountsList() {
        return new AccountsList();
    }

    /**
     * Create an instance of {@link AccountsListResponse }
     * 
     * @return
     *     the new instance of {@link AccountsListResponse }
     */
    public AccountsListResponse createAccountsListResponse() {
        return new AccountsListResponse();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetSymbols }
     * 
     * @return
     *     the new instance of {@link GetSymbols }
     */
    public GetSymbols createGetSymbols() {
        return new GetSymbols();
    }

    /**
     * Create an instance of {@link GetSymbolsResponse }
     * 
     * @return
     *     the new instance of {@link GetSymbolsResponse }
     */
    public GetSymbolsResponse createGetSymbolsResponse() {
        return new GetSymbolsResponse();
    }

    /**
     * Create an instance of {@link SymbolsWrapper.Symbols.Entry }
     * 
     * @return
     *     the new instance of {@link SymbolsWrapper.Symbols.Entry }
     */
    public SymbolsWrapper.Symbols.Entry createSymbolsWrapperSymbolsEntry() {
        return new SymbolsWrapper.Symbols.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountsList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AccountsList")
    public JAXBElement<AccountsList> createAccountsList(AccountsList value) {
        return new JAXBElement<>(_AccountsList_QNAME, AccountsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountsListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AccountsListResponse")
    public JAXBElement<AccountsListResponse> createAccountsListResponse(AccountsListResponse value) {
        return new JAXBElement<>(_AccountsListResponse_QNAME, AccountsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSymbols }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSymbols }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetSymbols")
    public JAXBElement<GetSymbols> createGetSymbols(GetSymbols value) {
        return new JAXBElement<>(_GetSymbols_QNAME, GetSymbols.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSymbolsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSymbolsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetSymbolsResponse")
    public JAXBElement<GetSymbolsResponse> createGetSymbolsResponse(GetSymbolsResponse value) {
        return new JAXBElement<>(_GetSymbolsResponse_QNAME, GetSymbolsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolsWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SymbolsWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "SymbolsWrapper")
    public JAXBElement<SymbolsWrapper> createSymbolsWrapper(SymbolsWrapper value) {
        return new JAXBElement<>(_SymbolsWrapper_QNAME, SymbolsWrapper.class, null, value);
    }

}
