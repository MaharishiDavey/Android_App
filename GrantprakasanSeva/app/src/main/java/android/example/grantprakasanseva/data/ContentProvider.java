package android.example.grantprakasanseva.data;

import android.net.Uri;

public class ContentProvider extends MyContract {
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_DATATABLE).build();

    public static final String SMK = "Smk";

}
