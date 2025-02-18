package kr.co.crim.oss.rimdrive.common.utils;

public class Constant {

    public static final String COMMOM_RESULT_SUCCESS = "SUCCESS";
    public static final String COMMOM_RESULT_FAIL = "FAIL";
    public static final String COMMOM_YES = "Y";
    public static final String COMMOM_NO = "N";
    public static final int COMMOM_SUCCESS_CODE = 0;
    public static final int COMMOM_FAIL_CODE = 999;
    public static final String DATE_FORMMAT_DAY = "yyyyMMdd";
    public static final String OWNER_TYPE_USER = "U";
    public static final String OWNER_TYPE_GROUP = "G";
    public static final String AUTH_TYPE_READ = "R";
    public static final String AUTH_TYPE_WRITE = "W";
    public static final String AUTH_TYPE_NOAUTH = "N";
    public static final String CREATE_TYPE = "C";
    public static final String STORAGE_MOUNT_FILE_PATH = "files";
    public static final String STORAGE_MOUNT_TRASH_PATH = "files_trashbin";
    public static final String STORAGE_MOUNT_VERSION_PATH = "files_versions";
    public static final String STORAGE_MOUNT_TEMP_PATH = "files_temp";
    public static final String FILE_SEPARATOR = "/";
    public static final String FILE_SYSTEM_SEPARATOR = "///";
    public static final int FOLDER_MAX_LENGTH = 244;
    public static final int FILE_MAX_LENGTH = 255;
    public static final long makeFileSize = 1000000;
    public static final String FILE_DELIMITER_DELETE = ".d";
    public static final String FILE_DELIMITER_VERSION = ".v";
    public static final String FILE_DELIMITER_TEMP = ".t";
    public static final String FILE_DELIMITER_TRASHBIN = ".";
    public static final int FILE_COPY_SIBLING_INDEX_START = 2;
    public static final String FILE_ACTION_TYPE_NEWNAME = "N";
    public static final String FILE_ACTION_TYPE_REWRITE = "R";
    public static final String FILE_ACTION_TYPE_CANCEL = "C";
    public static final String FILE_COPY_POSTFIX = "복사본";
    public static final String FILE_OWNER_CHANGE_PREFIX = "님의_이관파일";
    public static final String FILE_TYPE_FILES = "F";
    public static final String FILE_TYPE_DIRECTORY = "D";
    public static final String FILE_TYPE_TRASH = "D";
    public static final String FILE_TYPE_VERSION = "V";
    public static final String FILE_TYPE_ROOT = "R";
    public static final String FILE_TYPE_TEMP = "T";
    public static final String FILE_ALL_DOWNLOAD_NAME = "download";
    public static final String FILE_DUPLICATE_RESTORE_NAME = "복원됨";
    public static final String GROUP_STORAGE_ADMIN_MEMBER_TYPE = "A";
    public static final String GROUP_STORAGE_ADMIN_MASTER_MEMBER_TYPE = "AM";
    public static final String GROUP_STORAGE_ADMIN_SUBMASTER_MEMBER_TYPE = "AS";
    public static final String GROUP_STORAGE_USER_BASE_MEMBER_TYPE = "UB";
    public static final String GROUP_STORAGE_USER_DEPT_MEMBER_TYPE = "UD";
    public static final String GROUP_STORAGE_ID_PREFIX = "@";
    public static final int GROUP_STORAGE_NAME_MAX_LENGTH = 200;
    public static final String FILE_RENAME_TEMP = "_ReTemp";
    public static final int FILE_MAX_COUNT_VERSION = 10;
    public static final String SHARE_TYPE_DEPT = "D";
    public static final String SHARE_TYPE_USER = "U";
    public static final String SHARE_TYPE_GROUP= "G";
    public static final String PROTOCOL_WEB = "WEB";
    public static final String PROTOCOL_API = "API";
    public static final String PROTOCOL_OFFICE = "OFFICE";
    public static final String PROTOCOL_DESKTOP = "DESKTOP";
    public static final String PROTOCOL_MOBILE = "MOBLIE";
    public static final String FAIL_API = "/common/error/fail.do";
    public static final String STORAGE_ACCESS_TYPE_PERSONAL = "PA";
    public static final String STORAGE_ACCESS_TYPE_PERSONAL_SHARINGIN = "PS";
    public static final String STORAGE_ACCESS_TYPE_GROUP = "GA";
    public static final String STORAGE_ACCESS_TYPE_GROUP_SHARINGIN = "GS";
    public static final String STORAGE_ACCESS_TYPE_GROUP_DOWNLOAD_LOCK= "GL";
    public static final String STORAGE_SERVICES_TYPE_N = "N";
    public static final String DESKTOP_STATETP_LOGIN = "0";
    public static final String DESKTOP_STATETP_LOGOUT = "1";
    public static final String DESKTOP_STATETP_LOGOUT_AUTO = "2";
    public static final String DESKTOP_STATETP_LOGOUT_CLIENT = "3";
    public static final String DESKTOP_STATETP_LOGOUT_WEB = "4";
    public static final String DESKTOP_STATETP_DUP_LOGOUT = "5";
    public static final String STORAGE_ACCESS_TYPE_PERSONAL_TEXT = MessageSourceHelper.getMessage("label.storage.personal");
    public static final String STORAGE_ACCESS_TYPE_PERSONAL_SHARINGIN_TEXT = MessageSourceHelper.getMessage("label.files.sharingin");
    public static final String STORAGE_ACCESS_TYPE_GROUP_TEXT = MessageSourceHelper.getMessage("label.storage.group");
    public static final String STORAGE_ACCESS_TYPE_GROUP_SHARINGIN_TEXT = MessageSourceHelper.getMessage("label.files.sharingin");
    public static final String STORAGE_ACCESS_TYPE_ALL_FILES = MessageSourceHelper.getMessage("label.files.files");
    public static final String STORAGE_ACCESS_TYPE_SHARINGIN_FILES = MessageSourceHelper.getMessage("label.files.sharingin");
    public static final String OFFICE_ACCESS_TYPE_WEBOFFICE = "W";

}
