package oldRequestCreation;

public class Constants {


    //Other
    public String COMMENT = "This is COMMENT";
    public String EXAMPLE_FILE = "C:\\Users\\CRM Studio\\Pictures\\Screenshots\\server3\\1.png";
    public String EXAMPLE_WORD = "Test";
    public String EXAMPLE_EMAIL = "test@test.com";


    //Login data
    public String ADMIN_LOGIN = "admin";
    public String ADMIN_PASSWORD = "ma!R45Re74A";

    public String KM_PRIME_LOGIN = "KMprime";
    public String KM_PRIME_PASSWORD = "KMprimetest";

    public String KM_LOGIN = "KMtest";
    public String KM_PASSWORD = "KMtesttest";

    public String KLP_LOGIN = "konradkerz4@gmail.com";
    public String KLP_PASSWORD = "acue73E";

    public String ONK_MAIN_LOGIN = "ONKmain";
    public String ONK_MAIN_PASSWORD = "ONKmaintest";

    public String ONK_TEST_LOGIN = "ONKtest";
    public String ONK_TEST_PASSWORD = "ONKtesttest";

    // Main panel
    public String HOME = "//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']";
    public String PROVIDERS = "grouptab_0";
    public String CONTRACTS = "grouptab_1";
    public String PRODUCTS = "grouptab_2";

    //Contracts subpanel
    public String CONTRACTS_SUB = "//li[3]//span[2]//ul[1]//li[1]//a[1]";
    public String CONTRACT_REQUESTS = "//li[3]//span[2]//ul[1]//li[2]//a[1]";
    public String MAIN_PAGE_CONTR = "//li[3]//span[2]//ul[1]//li[3]//a[1]";

    //Providers subpenel
    public String CONTACTS = "//li[2]//span[2]//ul[1]//li[2]//a[1]";
    public String PROVIDERS_SUB = "//li[2]//span[2]//ul[1]//li[1]//a[1]";
    public String NON_COOPERATE = "//li[2]//span[2]//ul[1]//li[3]//a[1]";
    public String MAIN_PAGE_PROV = "//li[2]//span[2]//ul[1]//li[4]//a[1]";
    public String RIYAD_PROV = "//tr[@class='oddListRowS1']//td[3]";


    //Products page
    public String PRODUCTS_SUB = "//li[4]//span[2]//ul[1]//li[1]//a[1]";
    public String MAIN_PAGE_PROD = "//li[4]//span[2]//ul[1]//li[2]//a[1]";

    // User panel
    public String USER_PANEL = "//button[@id='with-label']//span[@class='suitepicon suitepicon-action-current-user']";
    public String USER_PANEL_PROFILE = "//div[@class='desktop-bar']//li[@id='globalLinks']//li[1]//a[1]";
    public String USER_PANEL_WORKERS = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='employees_link']";
    public String USER_PANEL_ADMINISTRATION = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='admin_link']";
    public String USER_PANEL_HELP = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='about_link']";
    public String USER_PANEL_ADDITIONAL = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='reference_link']";

    //Administration panel
    public String USERS_CONTROL = "//a[@id='user_management']";
    public String ROLE_CONTROL = "//a[@id='roles_management']";
    public String PASSWORD_CONTROL = "//a[@id='password_management']";
    public String USERS_GROUPS_CONTROL = "//a[@id='securitygroup_management']";
    public String USERS_GROUPS_SETTINGS = "//a[@id='securitygroup_config']";


    //Buttons
    public String EDIT_BUTTON = "//input[@id='edit_button']";
    public String SAVE_HEADER_BUTTON = "SAVE_HEADER";
    public String SAVE_FOOTER_BUTTON = "SAVE_FOOTER";
    public String ADD_ROLE_BUTTON = "//*[@id=\"formDetailView\"]/div/input[2]";
    public String ROLE_OK_BUTTON = "//div[@class='arcticmodal-container']//div[5]//input[1]";
    public String ACTION_BUTTON = "/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/ul[1]/li[1]/span[1]";
    public String CREATE_PRODUCT_BUTTON = "//li[1]//a[1]//div[2]";
    public String PROVIDER_CHOOSE_BUTTON = "btn_accounts_aos_products_1_name";
    public String CONTRACT_CHOOSE_BUTTON = "btn_contract";
    public String SAVE_BUTTON = "SAVE";
    public String NEW_CONTACT_BUTTON = "//li[1]//a[1]//div[2]";
    public String PORTAL_USER_BUTTON = "//input[@id='createUserAccountBtn']";
    public String PORTAL_USER_BUTTON_ = "//input[@id='create_user_account_btn']";
    public String ADMINISTRATOR_BUTTON = "//button[@id='with-label']";
    public String ADMINISTRATION_BUTTON = "//div[@class='desktop-bar']//ul[@id='toolbar']//li[@id='globalLinks']//ul[@class='dropdown-menu user-dropdown user-menu']//li//a[@id='admin_link']";
    public String USERS_MANAGEMENT_BUTTON = "//a[@id='user_management']";
    public String CREATE_CONTRACT_REQUEST_BUTTON = "//input[@id='createCCRBtn']";
    public String KM_FIELD_BUTTON = "li.hidden-xs:nth-child(2) > a:nth-child(1)";
    public String KM_SENDBACK_BUTTON = "sendRevisionSupplierBtn";
    public String KLP_SCAN_DOCS_BUTTON = "//li[@class='hidden-xs']//a[@id='tab2']";
    public String KLP_FIRM_DATA = "//li[@class='hidden-xs']//a[@id='tab3']";
    public String KLP_CONTACTS = "li.hidden-xs:nth-child(5) > a:nth-child(1)";
    public String KLP_ACCEPT_PROVIDER_BUTTON = "//li[2]//a[1]//div[2]";
    public String KLP_OTHER_TERMS_BUTTON = "li.hidden-xs:nth-child(6) > a:nth-child(1)";
    public String KLP_GRAPHIC_BUTTON = "li.hidden-xs:nth-child(7) > a:nth-child(1)";
    public String KLP_SPECIFICATION_BUTTON = "li.hidden-xs:nth-child(8) > a:nth-child(1)";
    public String KLP_CONFIRM_BUTTON = "confirmKlpBtn";
    public String KM_CONFIRM_BUTTON = "confirmKMBtn";


    public String ROLE_REMOVE = "aclroles_remove_1";
    public String ROLE_SUBPANEL = "subpanel_title_aclroles";
    public String TITLE = "title";
    public String DEPARTMENT_LIST = "department_lst";
    public String DEPARTMENT_OPT_1 = "//select[@id='department_lst']//option[1]";
    public String CLEAR_REPORTS = "btn_clr_reports_to_name";

    //Filter
    public String OPEN_FILTER = "//ul[@class='clickMenu selectmenu searchLink SugarActionMenu listViewLinkButton listViewLinkButton_top']//a[@class='glyphicon glyphicon-filter parent-dropdown-handler']";
    public String LOGIN = "user_name_advanced";
    public String NAME = "name_advanced";
    public String PROVIDER_NAME_FILTER = "name_advanced";
    public String LAST_NAME = "last_name_advanced";
    public String SEARCH_BTN = "search_form_submit_advanced";

    //Role options
    public String KM_ROLE = "//select[@id='user_role']//option[7]";
    public String HEAD_1_4 = "//option[contains(text(),'1-4')]";
    public String KLP = "//select[@id='user_role']//option[5]";
    public String KLP_MAIN = "//select[@id='user_role']//option[6]";
    public String WITHOUT_RIGHTS = "//body//option[16]";

    //Department options
    public String INFORMATION_COLLECTION = "//select[@id='user_department']//option[2]";


    //Role Errors
    public String ROLE_ERROR = "user_role_popup_error";
    public String TITLE_ERROR = "title_popup_error";
    public String DEPARTMENT_ERROR = "department_popup_error";
    public String POPUP_ERROR = "report_to_popup_error";

    //Products
    public String PRODUCT_MAIN_TAB = "grouptab_2";
    public String PRODUCT_TAB = "//li[4]//span[2]//ul[1]//li[1]//a[1]";

    //Products fields
    public String MAIN_INFO_BUTTON = "String VGH_BUTTON = \"//body/div[@id='bootstrap-container']/div[@id='content']/form[@id='EditView']/div[@id='EditView_tabs']/ul[@class='nav nav-tabs']/li[1]";
    public String FULL_NAME = "name";
    public String CODE_AP = "code";
    public String PRODUCT_STATUS_NEW = "//select[@id='status']//option[2]";
    public String CATEGORY_BAK = "//select[@id='category']//option[3]";
    public String PRODUCT_CATEGORY_OPT5 = "//select[@id='product_category']//option[5]";
    public String PRODUCT_CLASS = "//select[@id='product_class']//option[contains(text(),'(')]";
    public String PRODUCT_SUBCLASS = "//select[@id='product_subclass']//option[contains(text(),'(')]";

    //Provider filter
    public String PROVIDER_NAME = "name_advanced";
    public String SEARCH_PROVIDER_BUTTON = "search_form_submit";
    public String TABLE_ELEMENT_RIYAD = "Рияд Рамирес аль Хасар";

    //Contract filter
    public String CONTRACT_NAME = "name_advanced";
    public String SEARCH_CONTRACT_BUTTON = "search_form_submit";
    public String CONTRACT_NUMBER = "//a[contains(text(),'33222240')]";

    //VGH Information
    public String VGH_BUTTON = "//body/div[@id='bootstrap-container']/div[@id='content']/form[@id='EditView']/div[@id='EditView_tabs']/ul[@class='nav nav-tabs']/li[2]";
    public String PACK_INSIDE = "attachments_packaging";
    public String PALLET_PCS = "attachments_pallet_pcs";
    public String LAYERS_PCS = "attachments_layer_pcs";
    public String BOX_INSIDE = "attachments_box";
    public String PALLET_BOX = "attachments_pallet_box";
    public String LAYERS_BOX = "attachments_layer_box";

    public String MAX_DEVIATION = "max_deviation_gross";
    public String WEIGHT_PCS = "weight_pcs_gross";
    public String WIDTH_PRODUCT = "width_product";
    public String LENGTH_PRODUCT = "length_product";
    public String WEIGHT_PACK = "weight_pack";
    public String WEIGHT_PCS_NET = "weight_pcs_net";
    public String HEIGHT_PRODUCT = "height_product";
    public String VOLUME_PRODUCT = "volume_product";

    //Additional Information
    public String ADDITIONAL_INFORMATION_BUTTON = "//body/div[@id='bootstrap-container']/div[@id='content']/form[@id='EditView']/div[@id='EditView_tabs']/ul[@class='nav nav-tabs']/li[3]";
    public String PROVIDER_CODE = "provider_code";
    public String PRODUCT_TYPE_OPT4 = "//select[@id='type']//option[4]";
    public String CODE_EDI = "code_edi";
    public String SEGMENT_OPT3 = "//select[@id='segment']//option[3]";
    public String PRICE_VAT = "price_with_vat";
    public String IMPORTED_OPT2 = "//select[@id='is_imported']//option[2]";
    public String CASH_OPT3 = "//select[@id='is_cash']//option[3]";
    public String SOURCE_OPT3 = "//select[@id='source']//option[3]";
    public String CONTRACT_ERP_ID = "id_contract_erp";
    public String PRIVATE_LABEL = "//select[@id='is_private_label']//option[2]";
    public String PRICE = "price_without_vat";
    public String RUSSIAN = "//select[@id='is_russian']//option[2]";

    //RMS Information
    public String RMS_BUTTON = "//body/div[@id='bootstrap-container']/div[@id='content']/form[@id='EditView']/div[@id='EditView_tabs']/ul[@class='nav nav-tabs']/li[4]";
    public String STATUS_RMS_OPT3 = "//select[@id='status_rms']//option[3]";
    public String CODE_VAT = "code_rate_vat";
    public String MANAGER_OPT10 = "//div[@id='tab-content-3']//option[10]";
    public String RATE_VAT = "rate_vat";
    public String COUNT_IN_UNIT = "amount_in_unit";

    // New contact fields
    public String NEW_CONTACT_NAME = "//input[@id='last_name']";
    public String NEW_CONTACT_EMAIL = "//input[@id='Contacts0emailAddress0']";
    public String NEW_CONTACT_PHONE = "//input[@id='phone_mobile']";
    public String NEW_CONTACT_TITLE = "//input[@id='title']";
    public String NEW_CONTACT_PROVIDER = "//input[@id='account_name']";

    // Riyad element in table
    public String RIYAD_TABLE_ELEMENT = "#MassUpdate > div.list-view-rounded-corners > table > tbody > tr > td:nth-child(3) > b > a";
    public String CONTACTS_SUBPANEL = "//a[@id='subpanel_title_contacts']";

    //KM fields
    public String REASON_CONTRACT_OPT2 = "//select[@id='conclusion_contract_reason']//option[2]";
    public String CONTRACTS_EXAMPLE_OPT3 = "//select[@id='contract_templates']//option[3]";
    public String CONTRACT_REGISTRATION_NUMBER = "registration_number_supply_contract_p";
    public String START_DATE = "date_start_supply_contract_p_trigger";
    public String START_DATE_DAY = "//a[contains(text(),'23')]";
    public String END_DATE = "//button[@id='date_end_supply_contract_p_trigger']";
    public String END_DATE_DAY = "//a[contains(text(),'30')]";
    public String DELAY = "delay_compensation_supply_contract_p";
    public String DISCOUNT = "discount_percent_supply_contract_p";
    public String PROMOTION = "postponement_days_supply_contract_p";
    public String CONTRACT_IS_TYPICAL = "//div[@id='commercial_terms_supply_contract_p_block']//option[2]";
    public String DELAY_COMPENSATION = "refund_compensation_supply_contract_p";
    public String LOGISTIC_HRN_KG = "logistics_uah_kg_supply_contract_p";
    public String COMPENSATION = "refund_compensation_supply_contract_p";
    public String BOOKER = "atb_accounter_name";
    public String ATB_ADDRESS = "atb_address";
    public String FULL_NAME_BOOKER_DOC = "auth_sign_acc_docs_discount_act_fullname_atb";
    public String ATB_EMAIL = "atb_email";
    public String FULL_NAME_KEP = "auth_sign_acc_docs_fullname_atb";

    //KLP elements
    public String MY_CONTRACTS = "grouptab_2";
    public String CONTRACT_CREATE_REQUEST = "//li[contains(@class,'topnav')]//li[2]//a[1]";
    public String LAST_TAB_REQUEST = "#MassUpdate > div.list-view-rounded-corners > table > tbody > tr:nth-child(1) > td:nth-child(3) > b";

    public String FILE_DOC_EDR = "extraction_egr_files0";
    public String FILE_DOC_COPY = "actual_statute_files0";
    public String FILE_DOC_REG_PDV = "vat_payer_register_files0";
    public String FILE_DOC_PROTOCOL = "general_meeting_protocol_head_appointment_files0";
    public String FILE_DOC_PASSPORT_COPY = "passport_inn_copy_files0";
    public String FILE_DOC_DOV_SEND = "power_of_attorney_files0";
    public String FILE_DOC_OTHER = "other_docs_files0";
    public String FILE_DOC_REGISTRATION = "state_registration_certificate_files0";
    public String FILE_DOC_EDRPOU = "statistics_department_help_files0";
    public String FILE_DOC_ADDING = "tax_payer_register_files0";
    public String FILE_DOC_BOSS = "head_appointment_order_files0";
    public String FILE_DOC_BANK = "bank_reference_files0";
    public String FILE_DOC_CONTRACT_PROTOCOL = "general_meeting_protocol_conclude_agreement_files0";

    public String POSITION = "signatory_position";
    public String BASE = "//div[@id='tab-content-3']//option[2]";
    public String ADDRESS = "production_location_addresses";
    public String BANK = "bank";
    public String PHONE = "phone_number";
    public String NAME_POD = "signatory_fullname";
    public String ADDRESS_CORESP = "correspondence_address";
    public String BANK_ACCOUNT = "bank_account";
    public String MFO = "mfo";
    public String EMAIL_KLP_REQUEST = "supplier_email";

    public String KLP_GD_CONT_NAME = "contact_person_fullname";
    public String KLP_GD_CONT_EMAIL = "contact_email";
    public String KLP_GD_CONT_PHONE = "director_phone";
    public String KLP_GD_CONT_PHONE_CODE = "contact_phone";
    public String KLP_GD_CONT_BOSS_NAME = "director_fullname";
    public String KLP_GD_CONT_BOSS_EMAIL = "director_email";

    public String KLP_CS_CONT_NAME = "sales_contact_person_fullname";
    public String KLP_CS_CONT_EMAIL = "sales_contact_email";
    public String KLP_CS_CONT_PHONE_CODE = "sales_contact_phone";

    public String KLP_ES_CONT_NAME = "economic_contact_person_fullname";
    public String KLP_ES_CONT_EMAIL = "economic_contact_email";
    public String KLP_ES_CONT_PHONE = "accountant_phone";
    public String KLP_ES_CONT_NAME_OTV = "service_specialist_fullname";
    public String KLP_ES_CONT_EMAIL_OTV = "service_specialist_email";
    public String KLP_ES_CONT_PHONE_CODE_OTV = "fines_specialist_phone";
    public String KLP_ES_CONT_PHONE_CODE = "economic_contact_phone";
    public String KLP_ES_CONT_NAME_BUH = "accountant_fullname";
    public String KLP_ES_CONT_EMAIL_BUH = "accountant_email";
    public String KLP_ES_CONT_PHONE_OTV = "service_specialist_phone";
    public String KLP_ES_CONT_NAME_OTV_PAY = "fines_specialist_fullname";
    public String KLP_ES_CONT_EMAIL_OTV_PAY = "fines_specialist_email";

    public String KLP_SM_CONT_NAME = "marketing_contact_person_fullname";
    public String KLP_SM_CONT_EMAIL = "marketing_contact_email";
    public String KLP_SM_CONT_PHONE = "marketing_contact_phone";

    public String KLP_OTHER_EMAIL = "supplier_requests_email";
    public String KLP_OTHER_EDI = "edi_operator_name";
    public String KLP_OTHER_GLN_EDI = "supplier_gnl_code";
    public String KLP_OTHER_EDRPOU_EDI = "edi_operator_edrpou";
    public String KLP_OTHER_STATUS = "//div[@class='panel panel-default tab-panel-5']//option[2]";
    public String KLP_OTHER_NAME = "auth_sign_acc_docs_fullname_supplier";
    public String KLP_OTHER_NAME_ACT = "auth_sign_acc_docs_discount_act_fullname_supplier";

    public String KLP_GRAPHIC_NAME_RC = "//option[contains(text(),', 23')]";
    public String KLP_GRAPHIC_NAME_GR = "//select[@id='delivery_schedule_name']//option[2]";
    public String KLP_GRAPHIC_VARIANT = "//textarea[@id='desired_delivery_schedule']";
    public String KLP_GRAPHIC_FREQUENCY = "//input[@id='delivery_frequency_week']";
    public String KLP_GRAPHIC_DAY_REQUEST = "//select[@id='request_day']//option[4]";
    public String KLP_GRAPHIC_DAY_PRODUCT = "//select[@id='delivery_day']//option[6]";
    public String KLP_GRAPHIC_TIME_REQUEST = "//input[@id='request_time']";
    public String KLP_GRAPHIC_TIME_PRODUCT_REC = "//input[@id='delivery_time_rc_recommended']";
    public String KLP_GRAPHIC_TIME_PRODUCT_LAST = "//input[@id='delivery_time_rc_limit']";
    public String KLP_GRAPHIC_PICTURE = "//input[@id='delivery_schedule_file']";

    public String KLP_SPECIFICATION_ART = "packaging_specification_name0";
    public String KLP_SPECIFICATION_FULL_NAME = "packaging_specification_full_name0";
    public String KLP_SPECIFICATION_TYPE = "packaging_specification_pallet_type0";
    public String KLP_SPECIFICATION_PRICE = "packaging_specification_replacement_cost0";
    public String KLP_SEND_ON_REVISION = "//li[4]//a[1]//div[2]";

    public String KM_FIRST_TABLE_ELEMENT = "#MassUpdate > div.list-view-rounded-corners > table > tbody > tr:nth-child(1) > td:nth-child(3) > b";
    public String KM_KMPRIME = "#tab-content-0 > div:nth-child(3) > div:nth-child(2) > div.col-xs-12.col-sm-8.detail-view-field";


}
