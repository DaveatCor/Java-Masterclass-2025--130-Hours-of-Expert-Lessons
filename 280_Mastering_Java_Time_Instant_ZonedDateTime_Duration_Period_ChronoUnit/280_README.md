## Instant
The Instant class is designed to represent only a point in time, or a timestamp

Interanlly, it stores a value in seconds and nanoseconds, from the fixed epoch time of 19070-10-10z.

As such, an Instant can't be formatted as a date or time, without providing time-zone
information.

When printed, Z is used as the suffix to indicate this timestampe is in reference to UTC.

This allows for comparisons, regardless of time zones or operating systems, which is why
it's an effective timestamp.