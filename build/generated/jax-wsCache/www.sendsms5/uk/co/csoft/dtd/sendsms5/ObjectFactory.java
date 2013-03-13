
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.csoft.dtd.sendsms5 package. 
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

    private final static QName _MessageTextMessage_QNAME = new QName("", "TextMessage");
    private final static QName _MessageGroupGraphic_QNAME = new QName("", "GroupGraphic");
    private final static QName _MessageSmsSubmitPdu_QNAME = new QName("", "SmsSubmitPdu");
    private final static QName _MessagePictureMessage_QNAME = new QName("", "PictureMessage");
    private final static QName _MessageRingtone_QNAME = new QName("", "Ringtone");
    private final static QName _MessageOperatorLogo_QNAME = new QName("", "OperatorLogo");
    private final static QName _MessageMMSNotification_QNAME = new QName("", "MMSNotification");
    private final static QName _MessageFlashMessage_QNAME = new QName("", "FlashMessage");
    private final static QName _MessageWAPPush_QNAME = new QName("", "WAPPush");
    private final static QName _SmartMessageData_QNAME = new QName("", "Data");
    private final static QName _AvailableCreditUsername_QNAME = new QName("", "Username");
    private final static QName _AvailableCreditPIN_QNAME = new QName("", "PIN");
    private final static QName _ReservedField3_QNAME = new QName("", "Field3");
    private final static QName _ReservedField2_QNAME = new QName("", "Field2");
    private final static QName _ReservedField4_QNAME = new QName("", "Field4");
    private final static QName _ReservedField1_QNAME = new QName("", "Field1");
    private final static QName _WAPPushFileUpload_QNAME = new QName("", "FileUpload");
    private final static QName _WAPPushLibraryNumber_QNAME = new QName("", "LibraryNumber");
    private final static QName _WAPPushSimplePush_QNAME = new QName("", "SimplePush");
    private final static QName _WAPPushSi_QNAME = new QName("", "si");
    private final static QName _SubmitDeliveryReceiptResponseText_QNAME = new QName("", "Text");
    private final static QName _RecipientSendCc_QNAME = new QName("", "SendCc");
    private final static QName _RecipientSendTo_QNAME = new QName("", "SendTo");
    private final static QName _RecipientSendBccAddressBook_QNAME = new QName("", "SendBccAddressBook");
    private final static QName _RecipientPhoneMake_QNAME = new QName("", "PhoneMake");
    private final static QName _RecipientSendCcAddressBook_QNAME = new QName("", "SendCcAddressBook");
    private final static QName _RecipientSendOptions_QNAME = new QName("", "SendOptions");
    private final static QName _RecipientPhoneModel_QNAME = new QName("", "PhoneModel");
    private final static QName _RecipientSendToAddressBook_QNAME = new QName("", "SendToAddressBook");
    private final static QName _RecipientSendBcc_QNAME = new QName("", "SendBcc");
    private final static QName _SendOptionsSendTimeDelay_QNAME = new QName("", "SendTimeDelay");
    private final static QName _SendOptionsSendTimeAbsolute_QNAME = new QName("", "SendTimeAbsolute");
    private final static QName _QueryAddressBookAddressBookGroupName_QNAME = new QName("", "AddressBookGroupName");
    private final static QName _QueryAddressBookAddressBookName_QNAME = new QName("", "AddressBookName");
    private final static QName _AddressBookEntryGivenName_QNAME = new QName("", "GivenName");
    private final static QName _AddressBookEntryFamilyName_QNAME = new QName("", "FamilyName");
    private final static QName _AddressBookEntryGroup_QNAME = new QName("", "Group");
    private final static QName _IndicationContent_QNAME = new QName("", "content");
    private final static QName _IndicationSiId_QNAME = new QName("", "si-id");
    private final static QName _SubmitMessageMessage_QNAME = new QName("", "Message");
    private final static QName _SubmitMessageReplyTo_QNAME = new QName("", "ReplyTo");
    private final static QName _SubmitMessageReserved_QNAME = new QName("", "Reserved");
    private final static QName _SubmitMessageRecipient_QNAME = new QName("", "Recipient");
    private final static QName _SubmitMessageMessageIdentifier_QNAME = new QName("", "MessageIdentifier");
    private final static QName _MMSFileUploadTextMessage1_QNAME = new QName("", "TextMessage1");
    private final static QName _MMSFileUploadFileType1_QNAME = new QName("", "FileType1");
    private final static QName _MMSFileUploadFileName1_QNAME = new QName("", "FileName1");
    private final static QName _MMSFileUploadContentType1_QNAME = new QName("", "ContentType1");
    private final static QName _MMSFileUploadFileTitle1_QNAME = new QName("", "FileTitle1");
    private final static QName _MMSFileUploadFileData1_QNAME = new QName("", "FileData1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.csoft.dtd.sendsms5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SmartMessage }
     * 
     */
    public SmartMessage createSmartMessage() {
        return new SmartMessage();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Reserved }
     * 
     */
    public Reserved createReserved() {
        return new Reserved();
    }

    /**
     * Create an instance of {@link QueryAddressBookResponse }
     * 
     */
    public QueryAddressBookResponse createQueryAddressBookResponse() {
        return new QueryAddressBookResponse();
    }

    /**
     * Create an instance of {@link AvailableMessagesResponse }
     * 
     */
    public AvailableMessagesResponse createAvailableMessagesResponse() {
        return new AvailableMessagesResponse();
    }

    /**
     * Create an instance of {@link MOMessage }
     * 
     */
    public MOMessage createMOMessage() {
        return new MOMessage();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link MMSLibraryNumber }
     * 
     */
    public MMSLibraryNumber createMMSLibraryNumber() {
        return new MMSLibraryNumber();
    }

    /**
     * Create an instance of {@link SubmitDeliveryReceiptResponse }
     * 
     */
    public SubmitDeliveryReceiptResponse createSubmitDeliveryReceiptResponse() {
        return new SubmitDeliveryReceiptResponse();
    }

    /**
     * Create an instance of {@link CollectedMessagesList }
     * 
     */
    public CollectedMessagesList createCollectedMessagesList() {
        return new CollectedMessagesList();
    }

    /**
     * Create an instance of {@link SubmitMessageResponse }
     * 
     */
    public SubmitMessageResponse createSubmitMessageResponse() {
        return new SubmitMessageResponse();
    }

    /**
     * Create an instance of {@link MMSNotification }
     * 
     */
    public MMSNotification createMMSNotification() {
        return new MMSNotification();
    }

    /**
     * Create an instance of {@link PermittedReplyTo }
     * 
     */
    public PermittedReplyTo createPermittedReplyTo() {
        return new PermittedReplyTo();
    }

    /**
     * Create an instance of {@link Indication }
     * 
     */
    public Indication createIndication() {
        return new Indication();
    }

    /**
     * Create an instance of {@link SubmitMessage }
     * 
     */
    public SubmitMessage createSubmitMessage() {
        return new SubmitMessage();
    }

    /**
     * Create an instance of {@link PermittedReplyToResponse }
     * 
     */
    public PermittedReplyToResponse createPermittedReplyToResponse() {
        return new PermittedReplyToResponse();
    }

    /**
     * Create an instance of {@link AvailableCredit }
     * 
     */
    public AvailableCredit createAvailableCredit() {
        return new AvailableCredit();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link SMSSUBMITPDU }
     * 
     */
    public SMSSUBMITPDU createSMSSUBMITPDU() {
        return new SMSSUBMITPDU();
    }

    /**
     * Create an instance of {@link SimplePush }
     * 
     */
    public SimplePush createSimplePush() {
        return new SimplePush();
    }

    /**
     * Create an instance of {@link WAPPush }
     * 
     */
    public WAPPush createWAPPush() {
        return new WAPPush();
    }

    /**
     * Create an instance of {@link MobileMessengerVersion }
     * 
     */
    public MobileMessengerVersion createMobileMessengerVersion() {
        return new MobileMessengerVersion();
    }

    /**
     * Create an instance of {@link MobileMessengerVersionResponse }
     * 
     */
    public MobileMessengerVersionResponse createMobileMessengerVersionResponse() {
        return new MobileMessengerVersionResponse();
    }

    /**
     * Create an instance of {@link CollectMessagesResponse }
     * 
     */
    public CollectMessagesResponse createCollectMessagesResponse() {
        return new CollectMessagesResponse();
    }

    /**
     * Create an instance of {@link AvailableMessages }
     * 
     */
    public AvailableMessages createAvailableMessages() {
        return new AvailableMessages();
    }

    /**
     * Create an instance of {@link AvailableCreditResponse }
     * 
     */
    public AvailableCreditResponse createAvailableCreditResponse() {
        return new AvailableCreditResponse();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link SendOptions }
     * 
     */
    public SendOptions createSendOptions() {
        return new SendOptions();
    }

    /**
     * Create an instance of {@link QueryAddressBook }
     * 
     */
    public QueryAddressBook createQueryAddressBook() {
        return new QueryAddressBook();
    }

    /**
     * Create an instance of {@link Si }
     * 
     */
    public Si createSi() {
        return new Si();
    }

    /**
     * Create an instance of {@link AddressBookEntry }
     * 
     */
    public AddressBookEntry createAddressBookEntry() {
        return new AddressBookEntry();
    }

    /**
     * Create an instance of {@link CollectMessages }
     * 
     */
    public CollectMessages createCollectMessages() {
        return new CollectMessages();
    }

    /**
     * Create an instance of {@link MMSFileUpload }
     * 
     */
    public MMSFileUpload createMMSFileUpload() {
        return new MMSFileUpload();
    }

    /**
     * Create an instance of {@link AddressBookEntryList }
     * 
     */
    public AddressBookEntryList createAddressBookEntryList() {
        return new AddressBookEntryList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TextMessage", scope = Message.class)
    public JAXBElement<String> createMessageTextMessage(String value) {
        return new JAXBElement<String>(_MessageTextMessage_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GroupGraphic", scope = Message.class)
    public JAXBElement<SmartMessage> createMessageGroupGraphic(SmartMessage value) {
        return new JAXBElement<SmartMessage>(_MessageGroupGraphic_QNAME, SmartMessage.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSSUBMITPDU }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SmsSubmitPdu", scope = Message.class)
    public JAXBElement<SMSSUBMITPDU> createMessageSmsSubmitPdu(SMSSUBMITPDU value) {
        return new JAXBElement<SMSSUBMITPDU>(_MessageSmsSubmitPdu_QNAME, SMSSUBMITPDU.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PictureMessage", scope = Message.class)
    public JAXBElement<SmartMessage> createMessagePictureMessage(SmartMessage value) {
        return new JAXBElement<SmartMessage>(_MessagePictureMessage_QNAME, SmartMessage.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ringtone", scope = Message.class)
    public JAXBElement<SmartMessage> createMessageRingtone(SmartMessage value) {
        return new JAXBElement<SmartMessage>(_MessageRingtone_QNAME, SmartMessage.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OperatorLogo", scope = Message.class)
    public JAXBElement<SmartMessage> createMessageOperatorLogo(SmartMessage value) {
        return new JAXBElement<SmartMessage>(_MessageOperatorLogo_QNAME, SmartMessage.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MMSNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MMSNotification", scope = Message.class)
    public JAXBElement<MMSNotification> createMessageMMSNotification(MMSNotification value) {
        return new JAXBElement<MMSNotification>(_MessageMMSNotification_QNAME, MMSNotification.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FlashMessage", scope = Message.class)
    public JAXBElement<String> createMessageFlashMessage(String value) {
        return new JAXBElement<String>(_MessageFlashMessage_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WAPPush }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WAPPush", scope = Message.class)
    public JAXBElement<WAPPush> createMessageWAPPush(WAPPush value) {
        return new JAXBElement<WAPPush>(_MessageWAPPush_QNAME, WAPPush.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Data", scope = SmartMessage.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createSmartMessageData(byte[] value) {
        return new JAXBElement<byte[]>(_SmartMessageData_QNAME, byte[].class, SmartMessage.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Username", scope = AvailableCredit.class)
    public JAXBElement<String> createAvailableCreditUsername(String value) {
        return new JAXBElement<String>(_AvailableCreditUsername_QNAME, String.class, AvailableCredit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIN", scope = AvailableCredit.class)
    public JAXBElement<String> createAvailableCreditPIN(String value) {
        return new JAXBElement<String>(_AvailableCreditPIN_QNAME, String.class, AvailableCredit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Field3", scope = Reserved.class)
    public JAXBElement<String> createReservedField3(String value) {
        return new JAXBElement<String>(_ReservedField3_QNAME, String.class, Reserved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Field2", scope = Reserved.class)
    public JAXBElement<String> createReservedField2(String value) {
        return new JAXBElement<String>(_ReservedField2_QNAME, String.class, Reserved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Field4", scope = Reserved.class)
    public JAXBElement<String> createReservedField4(String value) {
        return new JAXBElement<String>(_ReservedField4_QNAME, String.class, Reserved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Field1", scope = Reserved.class)
    public JAXBElement<String> createReservedField1(String value) {
        return new JAXBElement<String>(_ReservedField1_QNAME, String.class, Reserved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TextMessage", scope = SimplePush.class)
    public JAXBElement<String> createSimplePushTextMessage(String value) {
        return new JAXBElement<String>(_MessageTextMessage_QNAME, String.class, SimplePush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MMSFileUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileUpload", scope = WAPPush.class)
    public JAXBElement<MMSFileUpload> createWAPPushFileUpload(MMSFileUpload value) {
        return new JAXBElement<MMSFileUpload>(_WAPPushFileUpload_QNAME, MMSFileUpload.class, WAPPush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MMSLibraryNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LibraryNumber", scope = WAPPush.class)
    public JAXBElement<MMSLibraryNumber> createWAPPushLibraryNumber(MMSLibraryNumber value) {
        return new JAXBElement<MMSLibraryNumber>(_WAPPushLibraryNumber_QNAME, MMSLibraryNumber.class, WAPPush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplePush }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SimplePush", scope = WAPPush.class)
    public JAXBElement<SimplePush> createWAPPushSimplePush(SimplePush value) {
        return new JAXBElement<SimplePush>(_WAPPushSimplePush_QNAME, SimplePush.class, WAPPush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Si }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "si", scope = WAPPush.class)
    public JAXBElement<Si> createWAPPushSi(Si value) {
        return new JAXBElement<Si>(_WAPPushSi_QNAME, Si.class, WAPPush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Username", scope = AvailableMessages.class)
    public JAXBElement<String> createAvailableMessagesUsername(String value) {
        return new JAXBElement<String>(_AvailableCreditUsername_QNAME, String.class, AvailableMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIN", scope = AvailableMessages.class)
    public JAXBElement<String> createAvailableMessagesPIN(String value) {
        return new JAXBElement<String>(_AvailableCreditPIN_QNAME, String.class, AvailableMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TextMessage", scope = MMSLibraryNumber.class)
    public JAXBElement<String> createMMSLibraryNumberTextMessage(String value) {
        return new JAXBElement<String>(_MessageTextMessage_QNAME, String.class, MMSLibraryNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Text", scope = SubmitDeliveryReceiptResponse.class)
    public JAXBElement<String> createSubmitDeliveryReceiptResponseText(String value) {
        return new JAXBElement<String>(_SubmitDeliveryReceiptResponseText_QNAME, String.class, SubmitDeliveryReceiptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendCc", scope = Recipient.class)
    public JAXBElement<String> createRecipientSendCc(String value) {
        return new JAXBElement<String>(_RecipientSendCc_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendTo", scope = Recipient.class)
    public JAXBElement<String> createRecipientSendTo(String value) {
        return new JAXBElement<String>(_RecipientSendTo_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendBccAddressBook", scope = Recipient.class)
    public JAXBElement<String> createRecipientSendBccAddressBook(String value) {
        return new JAXBElement<String>(_RecipientSendBccAddressBook_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhoneMake", scope = Recipient.class)
    public JAXBElement<String> createRecipientPhoneMake(String value) {
        return new JAXBElement<String>(_RecipientPhoneMake_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendCcAddressBook", scope = Recipient.class)
    public JAXBElement<String> createRecipientSendCcAddressBook(String value) {
        return new JAXBElement<String>(_RecipientSendCcAddressBook_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendOptions", scope = Recipient.class)
    public JAXBElement<SendOptions> createRecipientSendOptions(SendOptions value) {
        return new JAXBElement<SendOptions>(_RecipientSendOptions_QNAME, SendOptions.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhoneModel", scope = Recipient.class)
    public JAXBElement<String> createRecipientPhoneModel(String value) {
        return new JAXBElement<String>(_RecipientPhoneModel_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendToAddressBook", scope = Recipient.class)
    public JAXBElement<String> createRecipientSendToAddressBook(String value) {
        return new JAXBElement<String>(_RecipientSendToAddressBook_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendBcc", scope = Recipient.class)
    public JAXBElement<String> createRecipientSendBcc(String value) {
        return new JAXBElement<String>(_RecipientSendBcc_QNAME, String.class, Recipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendTimeDelay", scope = SendOptions.class)
    public JAXBElement<Integer> createSendOptionsSendTimeDelay(Integer value) {
        return new JAXBElement<Integer>(_SendOptionsSendTimeDelay_QNAME, Integer.class, SendOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SendTimeAbsolute", scope = SendOptions.class)
    public JAXBElement<XMLGregorianCalendar> createSendOptionsSendTimeAbsolute(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SendOptionsSendTimeAbsolute_QNAME, XMLGregorianCalendar.class, SendOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AddressBookGroupName", scope = QueryAddressBook.class)
    public JAXBElement<String> createQueryAddressBookAddressBookGroupName(String value) {
        return new JAXBElement<String>(_QueryAddressBookAddressBookGroupName_QNAME, String.class, QueryAddressBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AddressBookName", scope = QueryAddressBook.class)
    public JAXBElement<String> createQueryAddressBookAddressBookName(String value) {
        return new JAXBElement<String>(_QueryAddressBookAddressBookName_QNAME, String.class, QueryAddressBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Text", scope = SubmitMessageResponse.class)
    public JAXBElement<String> createSubmitMessageResponseText(String value) {
        return new JAXBElement<String>(_SubmitDeliveryReceiptResponseText_QNAME, String.class, SubmitMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MMSFileUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileUpload", scope = MMSNotification.class)
    public JAXBElement<MMSFileUpload> createMMSNotificationFileUpload(MMSFileUpload value) {
        return new JAXBElement<MMSFileUpload>(_WAPPushFileUpload_QNAME, MMSFileUpload.class, MMSNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MMSLibraryNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LibraryNumber", scope = MMSNotification.class)
    public JAXBElement<MMSLibraryNumber> createMMSNotificationLibraryNumber(MMSLibraryNumber value) {
        return new JAXBElement<MMSLibraryNumber>(_WAPPushLibraryNumber_QNAME, MMSLibraryNumber.class, MMSNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GivenName", scope = AddressBookEntry.class)
    public JAXBElement<String> createAddressBookEntryGivenName(String value) {
        return new JAXBElement<String>(_AddressBookEntryGivenName_QNAME, String.class, AddressBookEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FamilyName", scope = AddressBookEntry.class)
    public JAXBElement<String> createAddressBookEntryFamilyName(String value) {
        return new JAXBElement<String>(_AddressBookEntryFamilyName_QNAME, String.class, AddressBookEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Group", scope = AddressBookEntry.class)
    public JAXBElement<String> createAddressBookEntryGroup(String value) {
        return new JAXBElement<String>(_AddressBookEntryGroup_QNAME, String.class, AddressBookEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Username", scope = PermittedReplyTo.class)
    public JAXBElement<String> createPermittedReplyToUsername(String value) {
        return new JAXBElement<String>(_AvailableCreditUsername_QNAME, String.class, PermittedReplyTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIN", scope = PermittedReplyTo.class)
    public JAXBElement<String> createPermittedReplyToPIN(String value) {
        return new JAXBElement<String>(_AvailableCreditPIN_QNAME, String.class, PermittedReplyTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content", scope = Indication.class)
    public JAXBElement<String> createIndicationContent(String value) {
        return new JAXBElement<String>(_IndicationContent_QNAME, String.class, Indication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "si-id", scope = Indication.class)
    public JAXBElement<String> createIndicationSiId(String value) {
        return new JAXBElement<String>(_IndicationSiId_QNAME, String.class, Indication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Username", scope = CollectMessages.class)
    public JAXBElement<String> createCollectMessagesUsername(String value) {
        return new JAXBElement<String>(_AvailableCreditUsername_QNAME, String.class, CollectMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIN", scope = CollectMessages.class)
    public JAXBElement<String> createCollectMessagesPIN(String value) {
        return new JAXBElement<String>(_AvailableCreditPIN_QNAME, String.class, CollectMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Message", scope = SubmitMessage.class)
    public JAXBElement<Message> createSubmitMessageMessage(Message value) {
        return new JAXBElement<Message>(_SubmitMessageMessage_QNAME, Message.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Username", scope = SubmitMessage.class)
    public JAXBElement<String> createSubmitMessageUsername(String value) {
        return new JAXBElement<String>(_AvailableCreditUsername_QNAME, String.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReplyTo", scope = SubmitMessage.class)
    public JAXBElement<String> createSubmitMessageReplyTo(String value) {
        return new JAXBElement<String>(_SubmitMessageReplyTo_QNAME, String.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reserved", scope = SubmitMessage.class)
    public JAXBElement<Reserved> createSubmitMessageReserved(Reserved value) {
        return new JAXBElement<Reserved>(_SubmitMessageReserved_QNAME, Reserved.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIN", scope = SubmitMessage.class)
    public JAXBElement<String> createSubmitMessagePIN(String value) {
        return new JAXBElement<String>(_AvailableCreditPIN_QNAME, String.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Recipient", scope = SubmitMessage.class)
    public JAXBElement<Recipient> createSubmitMessageRecipient(Recipient value) {
        return new JAXBElement<Recipient>(_SubmitMessageRecipient_QNAME, Recipient.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessageIdentifier", scope = SubmitMessage.class)
    public JAXBElement<String> createSubmitMessageMessageIdentifier(String value) {
        return new JAXBElement<String>(_SubmitMessageMessageIdentifier_QNAME, String.class, SubmitMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TextMessage1", scope = MMSFileUpload.class)
    public JAXBElement<String> createMMSFileUploadTextMessage1(String value) {
        return new JAXBElement<String>(_MMSFileUploadTextMessage1_QNAME, String.class, MMSFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileType1", scope = MMSFileUpload.class)
    public JAXBElement<String> createMMSFileUploadFileType1(String value) {
        return new JAXBElement<String>(_MMSFileUploadFileType1_QNAME, String.class, MMSFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileName1", scope = MMSFileUpload.class)
    public JAXBElement<String> createMMSFileUploadFileName1(String value) {
        return new JAXBElement<String>(_MMSFileUploadFileName1_QNAME, String.class, MMSFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ContentType1", scope = MMSFileUpload.class)
    public JAXBElement<String> createMMSFileUploadContentType1(String value) {
        return new JAXBElement<String>(_MMSFileUploadContentType1_QNAME, String.class, MMSFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileTitle1", scope = MMSFileUpload.class)
    public JAXBElement<String> createMMSFileUploadFileTitle1(String value) {
        return new JAXBElement<String>(_MMSFileUploadFileTitle1_QNAME, String.class, MMSFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileData1", scope = MMSFileUpload.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createMMSFileUploadFileData1(byte[] value) {
        return new JAXBElement<byte[]>(_MMSFileUploadFileData1_QNAME, byte[].class, MMSFileUpload.class, ((byte[]) value));
    }

}
