function[mean, median, mode] = stat(m, f) 

len_marks = length(m);
len_freq = length(f);

% mean calculation

sum_freq = sum(f);
mean = sum_freq / len_marks

% median calculation

if( (len_freq / 2) == 0 ) % if even
    medianIndex = int32((len_freq / 2));
    median = (f(medianIndex) + f(medianIndex + 1)) / 2
else % if odd
    medianIndex = int32((len_freq / 2));
    median = f(medianIndex)
end

%mode calculation

mode = max(f)

end
